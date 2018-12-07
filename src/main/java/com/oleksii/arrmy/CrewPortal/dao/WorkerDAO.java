package com.oleksii.arrmy.CrewPortal.dao;


import com.oleksii.arrmy.CrewPortal.model.Worker;

import java.util.List;

public interface WorkerDAO {

    int save(Worker worker);
    Worker get(int id);
    void delete(int id);
    void update(int id, Worker worker);
    List<Worker> list();
}
