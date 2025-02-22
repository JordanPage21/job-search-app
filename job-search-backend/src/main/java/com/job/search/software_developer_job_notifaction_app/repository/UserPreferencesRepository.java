package com.job.search.software_developer_job_notifaction_app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.job.search.software_developer_job_notifaction_app.entity.UserPreferences;
import com.job.search.software_developer_job_notifaction_app.entity.Users;

@Repository
public interface UserPreferencesRepository extends JpaRepository<UserPreferences, Integer> {
    UserPreferences findById(int id);
    UserPreferences findByUserId(int userId);
    UserPreferences findByUser(Users user);
    UserPreferences findByUser_Email(String email);
    List<UserPreferences> findByStackName(String stackName);
    List<UserPreferences> findByJobTitle(String jobTitle);
    List<UserPreferences> findByLocation(String location);
    List<UserPreferences> findByJobSalary(String jobSalary);
}