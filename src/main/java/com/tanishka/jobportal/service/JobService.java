package com.tanishka.jobportal.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tanishka.jobportal.entity.Job;
import com.tanishka.jobportal.exception.ResourceNotFoundException;
import com.tanishka.jobportal.repository.JobRepository;

@Service
public class JobService {

    private final JobRepository jobRepository;

    public JobService(JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }

    public Job createJob(Job job) {
        return jobRepository.save(job);
    }

    public List<Job> getAllJobs() {
        return jobRepository.findAll();
    }
    public List<Job> searchJobs(String title) {
    return jobRepository.findByTitleContainingIgnoreCase(title);
}
public Job getJobById(Long id) {
    return jobRepository.findById(id).orElseThrow(() ->
                    new ResourceNotFoundException(
                            "Job not found with id " + id));
}
public void deleteJob(Long id) {
    jobRepository.deleteById(id);
}
public Job updateJob(Long id, Job updatedJob) {

    Job existingJob =
            jobRepository.findById(id).orElse(null);

    if(existingJob == null) {
        return null;
    }

    existingJob.setTitle(updatedJob.getTitle());
    existingJob.setCompany(updatedJob.getCompany());
    existingJob.setLocation(updatedJob.getLocation());
    existingJob.setDescription(updatedJob.getDescription());
    existingJob.setSalary(updatedJob.getSalary());

    return jobRepository.save(existingJob);
}
public List<Job> searchByCompany(String company) {
    return jobRepository
            .findByCompanyContainingIgnoreCase(company);
}
}