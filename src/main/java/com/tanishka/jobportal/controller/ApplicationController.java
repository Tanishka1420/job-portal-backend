package com.tanishka.jobportal.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tanishka.jobportal.entity.Application;
import com.tanishka.jobportal.service.ApplicationService;

@RestController
@RequestMapping("/applications")
public class ApplicationController {

    private final ApplicationService applicationService;

    public ApplicationController(ApplicationService applicationService) {
        this.applicationService = applicationService;
    }

    @PostMapping
    public Application applyJob(
            @RequestBody Application application) {

        return applicationService.applyJob(application);
    }

    @GetMapping
    public List<Application> getAllApplications() {

        return applicationService.getAllApplications();
    }
    @GetMapping("/user/{userId}")
public List<Application> getApplicationsByUser(
        @PathVariable Long userId) {

    return applicationService
            .getApplicationsByUser(userId);
}
@GetMapping("/job/{jobId}")
public List<Application> getApplicationsByJob(
        @PathVariable Long jobId) {

    return applicationService
            .getApplicationsByJob(jobId);
}
}