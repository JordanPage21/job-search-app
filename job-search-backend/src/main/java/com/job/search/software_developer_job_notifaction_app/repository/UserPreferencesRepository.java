package com.job.search.software_developer_job_notifaction_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.job.search.software_developer_job_notifaction_app.entity.UserPreferences;

@Repository
public interface UserPreferencesRepository extends JpaRepository<UserPreferences, Integer> {
    
}