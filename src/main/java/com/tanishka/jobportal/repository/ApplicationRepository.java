package com.tanishka.jobportal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tanishka.jobportal.entity.Application;


public interface ApplicationRepository
        extends JpaRepository<Application, Long> 
        {List<Application> findByUserId(Long userId);
                List<Application> findByJobId(Long jobId);   

}