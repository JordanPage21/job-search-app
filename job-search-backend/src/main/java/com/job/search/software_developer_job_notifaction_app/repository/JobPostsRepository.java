package com.job.search.software_developer_job_notifaction_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.job.search.software_developer_job_notifaction_app.entity.JobPosts;

@Repository
public interface JobPostsRepository extends JpaRepository<JobPosts, Integer> {
    
}
