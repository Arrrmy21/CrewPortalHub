package com.oleksii.arrmy.CrewPortal.controller;

import com.oleksii.arrmy.CrewPortal.model.Worker;
import com.oleksii.arrmy.CrewPortal.service.WorkerService;
import com.oleksii.arrmy.CrewPortal.service.WorkerServiceImp;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.HttpStatus;


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

    @Test
    public void save() {

        Worker controlWorker = new Worker();
        controlWorker.setId(1);
        controlWorker.setName("Alex");
        controlWorker.setAge(99);

        when(workerServiceMock.save(controlWorker)).thenReturn(1);

        assertEquals("New Worker saved. Id:1", workerControllerMock.save(controlWorker).getBody());
        assertEquals(HttpStatus.OK, workerControllerMock.save(controlWorker).getStatusCode());
        verify(workerServiceMock, times(2)).save(controlWorker);
    }

    @Test
    public void get() {
    }

    @Test
    public void list() {
    }

    @Test
    public void update() {
    }

    @Test
    public void delete() {
    }
}
