package com.insurance.insurance.controller;

import org.springframework.web.bind.annotation.RestController;

import com.insurance.insurance.model.Activity;
import com.insurance.insurance.repository.ActivityRepository;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;




@RestController
public class ActivityController {
    @Autowired
    ActivityRepository activityRepository;
    Activity activity = new Activity();
    List<Activity> activityList = new ArrayList<Activity>();

    @RequestMapping("/testActivity")
    public String testActivity() {
        return "Sending Data From Activity Controller.";
    }
    //Add single Activity
    @PostMapping("/addActivity")
    public String addActivity(@RequestBody Activity activity) {
        activityRepository.save(activity);
        return "Activity Insertion success.";
    }
    // Add Multiple activities at once.
    @PostMapping("/addActivities")
    public List<Activity> addActivities(@RequestBody ArrayList<Activity> activityList) {
        return activityRepository.saveAll(activityList);
    } 

    // @GetMapping("/activity/{id}")
    // public Activity getActivity(@PathVariable Long id) {
    //     return activityRepository.findById(id)
    //     .orElseThrow(() -> new ActivityNotFoundException(id));
    // }
    
    //Get all activities at once
    @GetMapping("/activities")
    public List<Activity> getAllActivities(@RequestParam ArrayList<Activity> activityList) {
        return activityRepository.findAll();
    }
    
    
    
    
    
}
