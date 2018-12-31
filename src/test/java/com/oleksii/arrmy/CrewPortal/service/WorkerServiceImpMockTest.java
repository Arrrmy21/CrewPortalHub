package com.oleksii.arrmy.CrewPortal.service;

import com.oleksii.arrmy.CrewPortal.dao.WorkerDaoImpl;
import com.oleksii.arrmy.CrewPortal.model.Worker;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

/**
 * Checking whether WorkerService invokes WorkerDAO
 */

@RunWith(MockitoJUnitRunner.class)
public class WorkerServiceImpMockTest {

    @Mock
    WorkerDaoImpl workerDao;

    @InjectMocks
    WorkerServiceImp workerService;


    @Test
    public void save() {

        Worker workerExample = new Worker();
        workerExample.setId(119);
        workerExample.setName("workerName");

        workerService.save(workerExample);
        verify(workerDao, times(1)).save(workerExample);
    }

    @Test
    public void get() {
        workerService.get(Mockito.anyInt());
        verify(workerDao, times(1)).get(Mockito.anyInt());
    }

    @Test
    public void list() {

        workerService.list();
        verify(workerDao, times(1)).list();

    }

    @Test
    public void update() {
        Worker worker = new Worker();
        worker.setId(1);

        workerService.update(1, worker);
        verify(workerDao, times(1)).update(1, worker);

    }

    @Test
    public void delete() {

        workerService.delete(Mockito.anyInt());
        verify(workerDao, times(1)).delete(Mockito.anyInt());

    }
}
