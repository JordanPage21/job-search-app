package com.job.search.software_developer_job_notifaction_app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.job.search.software_developer_job_notifaction_app.entity.UserJobs;
import com.job.search.software_developer_job_notifaction_app.enums.JobStatus;

@Repository
public interface UserJobsRepository extends JpaRepository<UserJobs, Integer> {
    UserJobs findById(int id);
    List<UserJobs> findByUserId(int userId);
    UserJobs findByJobId(int jobPostId);
    List<UserJobs> findByStatus(JobStatus status);
}
