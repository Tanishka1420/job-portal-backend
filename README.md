# Job Portal Backend

A backend application built using Spring Boot, Spring Security, Hibernate, JPA and MySQL.

## Features

* User Registration
* BCrypt Password Encryption
* Job Management (Create, Read, Update, Delete)
* Job Search by Title
* Job Search by Company
* Job Application Management
* Input Validation
* Global Exception Handling
* Spring Security Integration
* RESTful APIs
* MySQL Database Integration

## Tech Stack

* Java
* Spring Boot
* Spring Security
* Spring Data JPA
* Hibernate
* MySQL
* Maven

## Architecture

Controller → Service → Repository → Database

## API Endpoints

### User APIs

* POST /users/register
* GET /users

### Job APIs

* POST /jobs
* GET /jobs
* GET /jobs/{id}
* PUT /jobs/{id}
* DELETE /jobs/{id}
* GET /jobs/search?title=
* GET /jobs/company?company=

### Application APIs

* POST /applications
* GET /applications
* GET /applications/user/{userId}
* GET /applications/job/{jobId}

## Security Features

* BCrypt Password Hashing
* Spring Security Configuration

## Database

* MySQL
* Hibernate ORM
* Spring Data JPA

## Author

Tanishka Singh
