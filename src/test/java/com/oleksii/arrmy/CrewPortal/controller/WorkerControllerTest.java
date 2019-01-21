package com.oleksii.arrmy.CrewPortal.controller;

import com.oleksii.arrmy.CrewPortal.model.Worker;
import com.oleksii.arrmy.CrewPortal.service.WorkerService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.HttpStatus;


import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class WorkerControllerTest {

    @Mock
    WorkerService workerServiceMock;

    @InjectMocks
    WorkerController workerControllerMock;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void myMethod() {
    }

//    @Test
//    public void save() {
//
//        Worker controlWorker = new Worker();
//        controlWorker.setId(77);
//        controlWorker.setName("Alex");
//        controlWorker.setAge(99);
//
//        when(workerServiceMock.save(controlWorker)).thenReturn(77);
//
//        assertEquals("New Worker saved. Id:77", workerControllerMock.save(controlWorker).getBody());
//        assertEquals(HttpStatus.OK, workerControllerMock.save(controlWorker).getStatusCode());
//        verify(workerServiceMock, times(2)).save(controlWorker);
//
//    }

//    @Test
//    public void get() {
//
//        String workerName = "workerGetMethod";
//        Worker worker = new Worker();
//        worker.setId(44);
//        worker.setName(workerName);
//
//        when(workerServiceMock.get(44)).thenReturn(worker);
//
//        assertEquals(44, workerControllerMock.get(44).getBody().getId());
//        assertEquals(workerName, workerControllerMock.get(44).getBody().getName());
//        assertEquals(HttpStatus.OK, workerControllerMock.get(44).getStatusCode());
//        verify(workerServiceMock, times(3)).get(44);
//
//    }

    @Test
    public void list() {

        Worker firstWorker = new Worker();
        firstWorker.setId(51);
        firstWorker.setName("firstMan");
        firstWorker.setAge(551);

        Worker secondWorker = new Worker();
        secondWorker.setId(56);
        secondWorker.setName("secondMan");
        secondWorker.setAge(556);

        List<Worker> workerList = new ArrayList<>();
        workerList.add(firstWorker);
        workerList.add(secondWorker);

        when(workerServiceMock.list()).thenReturn(workerList);

        assertEquals("firstMan", workerControllerMock.list().getBody().get(0).getName());
        assertEquals(51, workerControllerMock.list().getBody().get(0).getId());

        assertEquals("secondMan", workerControllerMock.list().getBody().get(1).getName());
        assertEquals(56, workerControllerMock.list().getBody().get(1).getId());

        verify(workerServiceMock, times(4)).list();

    }

//    @Test
//    public void update() {
//
//
//        Worker workerToBeUpdated = new Worker();
//        workerToBeUpdated.setId(112);
//        workerToBeUpdated.setName("WorkerName");
//
//        assertEquals("Worker has been updated successfully.",
//                workerControllerMock.update(113, workerToBeUpdated).getBody());
//        assertEquals(HttpStatus.OK, workerControllerMock.update(113, workerToBeUpdated).getStatusCode());
//
//        verify(workerServiceMock, times(2)).update(113, workerToBeUpdated);
//
//    }

//    @Test
//    public void delete() {
//
//        Worker controlWorker = new Worker();
//        controlWorker.setId(77);
//        controlWorker.setName("Alex");
//
//        assertEquals("Worker has been deleted successfully.", workerControllerMock.delete(77).getBody());
//        assertEquals(HttpStatus.OK, workerControllerMock.delete(77).getStatusCode());
//        verify(workerServiceMock, times(2)).delete(77);
//
//    }
}
