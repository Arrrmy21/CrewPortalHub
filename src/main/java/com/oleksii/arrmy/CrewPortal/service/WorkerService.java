package com.oleksii.arrmy.CrewPortal.service;

import com.oleksii.arrmy.CrewPortal.model.Worker;

import java.util.List;

public interface WorkerService   {

    int save(Worker worker);
    Worker get(int id);
    List<Worker> list();
    void update(int id, Worker worker);
    void delete(int id);
}
