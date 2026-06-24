package com.tanishka.jobportal.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tanishka.jobportal.entity.Application;
import com.tanishka.jobportal.repository.ApplicationRepository;

@Service
public class ApplicationService {

    private final ApplicationRepository applicationRepository;

    public ApplicationService(ApplicationRepository applicationRepository) {
        this.applicationRepository = applicationRepository;
    }

    public Application applyJob(Application application) {

        application.setStatus("APPLIED");

        return applicationRepository.save(application);
    }

    public List<Application> getAllApplications() {
        return applicationRepository.findAll();
    }
    public List<Application> getApplicationsByUser(
        Long userId) {

    return applicationRepository.findByUserId(userId);
}
public List<Application> getApplicationsByJob(
        Long jobId) {

    return applicationRepository.findByJobId(jobId);
}
}