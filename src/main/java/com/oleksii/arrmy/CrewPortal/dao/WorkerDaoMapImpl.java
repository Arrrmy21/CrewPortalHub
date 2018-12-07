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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Repository
public class WorkerDaoMapImpl implements WorkerDAO {

    HashMap<Integer, Worker> workerMap = new HashMap<>();



    @Override
    public int save(Worker worker) {
        workerMap.put(worker.getId(), worker);
        return worker.getId();
    }

    @Override
    public Worker get(int id) {
        return workerMap.get(id);
    }

    @Override
    public void delete(int id) {
        workerMap.remove(id);
    }

    @Override
    public void update(int id, Worker worker) {
        workerMap.put(id, worker);
    }

    @Override
    public List<Worker> list() {

        return new ArrayList<>(workerMap.values());
    }
}
