package com.tanishka.jobportal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tanishka.jobportal.entity.User;

public interface UserRepository
        extends JpaRepository<User, Long> {

}
