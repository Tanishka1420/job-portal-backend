package com.tanishka.jobportal.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tanishka.jobportal.entity.Job;
import com.tanishka.jobportal.service.JobService;


@RestController
@RequestMapping("/jobs")
public class JobController {

    private final JobService jobService;

    public JobController(JobService jobService) {
        this.jobService = jobService;
    }

    @PostMapping
    public Job createJob(@RequestBody Job job) {
        return jobService.createJob(job);
    }

    @GetMapping
    public List<Job> getAllJobs() {
        return jobService.getAllJobs();
    }
    @GetMapping("/search")
public List<Job> searchJobs(
        @RequestParam String title) {

    return jobService.searchJobs(title);
}
@GetMapping("/{id}")
public Job getJobById(
        @PathVariable Long id) {

    return jobService.getJobById(id);
}
@DeleteMapping("/{id}")
public String deleteJob(
        @PathVariable Long id) {

    jobService.deleteJob(id);

    return "Job Deleted Successfully";
}
@PutMapping("/{id}")
public Job updateJob(
        @PathVariable Long id,
        @RequestBody Job job) {

    return jobService.updateJob(id, job);
}
@GetMapping("/company")
public List<Job> searchByCompany(
        @RequestParam String company) {

    return jobService.searchByCompany(company);
}
}