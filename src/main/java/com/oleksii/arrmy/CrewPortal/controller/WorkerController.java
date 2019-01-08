package com.oleksii.arrmy.CrewPortal.controller;

import com.oleksii.arrmy.CrewPortal.model.Worker;
import com.oleksii.arrmy.CrewPortal.service.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

//@RestController
@Controller
public class WorkerController {

    @Autowired
    private WorkerService workerService;

    @RequestMapping(value = "/")
    public String viweHello(Model model) {
        return "mainPage";
    }


    @RequestMapping(value = "/listA", method = RequestMethod.GET)
    public ModelAndView viweWorkers(ModelMap model) {
        model.addAttribute("workers", "Worker 1,2,3");
        return new ModelAndView("list");
    }



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
