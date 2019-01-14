package com.oleksii.arrmy.CrewPortal.controller;

import com.oleksii.arrmy.CrewPortal.model.Worker;
import com.oleksii.arrmy.CrewPortal.service.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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
    public String showMainPage(ModelAndView model) {

        List<Worker> listOfWorkers = workerService.list();
        model.addObject("listOfWorkers", listOfWorkers);
        return "mainPage";
    }

    @RequestMapping(value = "/location", method = RequestMethod.GET)
    public ModelAndView location(ModelMap model) {

        model.addAttribute("workers", "Worker 1,2,3");
        return new ModelAndView("location");
    }

//    public ResponseEntity<?> save(@RequestBody Worker worker) {
//        @PostMapping("/worker/add")
//        int id = workerService.save(worker);
//        return ResponseEntity.ok().body("New Worker saved. Id:" + id);
//    }

    @PostMapping("/worker/add")
    public String save(@ModelAttribute(name = "worker") Worker worker, Model model) {

        int id = workerService.save(worker);
        String msg = "New Worker saved. Id:" + id;
        model.addAttribute("message", msg);
        return "confirm";
    }

    @GetMapping(value = "/worker/add")
    public ModelAndView openAddPage() {

        return new ModelAndView("add");
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

    @RequestMapping(value = "/confirm")
    public ModelAndView confirm(ModelMap model, String message) {
        model.addAttribute("message", message);
        return new ModelAndView("confirm");
    }

}
