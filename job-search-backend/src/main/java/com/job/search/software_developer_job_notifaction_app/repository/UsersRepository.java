package com.job.search.software_developer_job_notifaction_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.job.search.software_developer_job_notifaction_app.entity.UserPreferences;
import com.job.search.software_developer_job_notifaction_app.entity.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, Integer> {
    Users findByEmail(String email);
    Users findById(int id);
    Users findByEmailAndPassword(String email, String password);
    Users findByFirstNameAndLastName(String firstName, String lastName);
    Users findByFirstName(String firstName);
    Users findByLastName(String lastName);  
    Users findByUserPreferences(UserPreferences userPrefs);
}