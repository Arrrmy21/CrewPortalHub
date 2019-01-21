package com.oleksii.arrmy.CrewPortal.controller;

import com.oleksii.arrmy.CrewPortal.model.Location;
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

import java.util.ArrayList;
import java.util.List;

//@RestController
@Controller
public class WorkerController {

    @Autowired
    private WorkerService workerService;

    @RequestMapping(value = "/")
    public String showMainPage(Model model) {

        List<Worker> listOfWorkers = workerService.list();

        model.addAttribute("listOfWorkers", listOfWorkers);
        return "mainPage";
    }

    @GetMapping(value = "worker/location/{id}")
    public String getLocationOfWorkerById(@PathVariable("id") int workerId, Model model) {

        Worker worker = workerService.get(workerId);
        Location location = worker.getLocation();
        model.addAttribute("location", location);
        return "location";
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
    public String get(@PathVariable("id") int id, Model model) {

        Worker worker = workerService.get(id);

        model.addAttribute("worker", worker);

        return "profile";
    }

    @GetMapping("/worker/list")
    public ResponseEntity<List<Worker>> list() {

        List<Worker> workers = workerService.list();
        return ResponseEntity.ok().body(workers);
    }

    @PostMapping("/worker/update/{id}")
    public String update(@PathVariable("id") int id, @ModelAttribute("worker") Worker worker, Model model) {

        workerService.update(id, worker);

        String responseMessage = "Worker has been updated successfully.";

        model.addAttribute("message", responseMessage);

        return "confirm";
    }

    @GetMapping("/worker/update/")
    public String updatePage( Model model) {

//        model.addAttribute("id", id);
        return "update";
    }



    @RequestMapping("/worker/remove/{id}")
    public String delete(@PathVariable("id") int id, Model model) {

        workerService.delete(id);

        String message = "Worker has been deleted successfully.";
        model.addAttribute("message", message);

        return "confirm";
    }

    @RequestMapping(value = "/confirm")
    public ModelAndView confirm(ModelMap model, String message) {
        model.addAttribute("message", message);
        return new ModelAndView("confirm");
    }

}
