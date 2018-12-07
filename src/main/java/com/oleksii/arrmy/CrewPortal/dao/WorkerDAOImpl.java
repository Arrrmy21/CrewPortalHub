package com.oleksii.arrmy.CrewPortal.dao;

import com.oleksii.arrmy.CrewPortal.model.Worker;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

//@Repository
public class WorkerDAOImpl implements WorkerDAO {


    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public int save(Worker worker) {
        sessionFactory.getCurrentSession().save(worker);
        return worker.getId();
    }

    @Override
    public Worker get(int id) {
        return sessionFactory.getCurrentSession().get(Worker.class, id);
    }

    @Override
    public void delete(int id) {
        Session session = sessionFactory.getCurrentSession();
        Worker worker = session.byId(Worker.class).load(id);
        session.delete(worker);
    }

    @Override
    public void update(int id, Worker worker) {
        Session session = sessionFactory.getCurrentSession();
        Worker currentWorker = session.byId(Worker.class).load(id);
        currentWorker.setName(worker.getName());
        currentWorker.setLocation(worker.getLocation());
        currentWorker.setPhoneNumber(worker.getPhoneNumber());

        currentWorker.setAge(worker.getAge());
        currentWorker.setYearIncome(worker.getYearIncome());
        currentWorker.setMaritalStatus(worker.getMaritalStatus());
        session.flush();
    }

    @Override
    public List<Worker> list() {
        Session session = sessionFactory.getCurrentSession();
        CriteriaBuilder cb = session.getCriteriaBuilder();
        CriteriaQuery<Worker> cq = cb.createQuery(Worker.class);
        Root<Worker> root = cq.from(Worker.class);
        cq.select(root);
        Query<Worker> query = session.createQuery(cq);
        return query.getResultList();
    }
}
