package com.oleksii.arrmy.CrewPortal.controller;

import com.oleksii.arrmy.CrewPortal.model.Worker;
import com.oleksii.arrmy.CrewPortal.service.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class WorkerController {

    @Autowired
    private WorkerService workerService;

    @PostMapping("/worker/add")
    public ResponseEntity<?> save(@RequestBody Worker worker){
        int id = workerService.save(worker);
        return ResponseEntity.ok().body("New Worker saved. Id:" + id);
    }

    @GetMapping("/worker/get/{id}")
    public ResponseEntity<Worker> get(@PathVariable("id") int id) {
        Worker worker = workerService.get(id);
        return ResponseEntity.ok().body(worker);
    }

    @GetMapping("/worker/list")
    public ResponseEntity<List<Worker>> list() {
        List<Worker> workers = workerService.list();
        return ResponseEntity.ok().body(workers);
    }

    @PutMapping("/worker/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody Worker worker) {
        workerService.update(id, worker);
        return ResponseEntity.ok().body("Worker has been updated successfully.");
    }

    @DeleteMapping("/worker/remove/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id) {
        workerService.delete(id);
        return ResponseEntity.ok().body("Worker has been deleted successfully.");
    }

}
