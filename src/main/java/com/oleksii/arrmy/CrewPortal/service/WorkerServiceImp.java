package com.oleksii.arrmy.CrewPortal.service;

import com.oleksii.arrmy.CrewPortal.dao.WorkerDAO;
import com.oleksii.arrmy.CrewPortal.model.Worker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class WorkerServiceImp implements WorkerService {

    @Autowired
    private WorkerDAO workerDAO;

    @Transactional
    @Override
    public int save(Worker worker) {
        return workerDAO.save(worker);
    }

    @Override
    public Worker get(int id) {
        return workerDAO.get(id);
    }

    @Override
    public List<Worker> list() {
        return workerDAO.list();
    }

    @Transactional
    @Override
    public void update(int id, Worker worker) {
        workerDAO.update(id, worker);
    }

    @Transactional
    @Override
    public void delete(int id) {
        workerDAO.delete(id);
    }
}
