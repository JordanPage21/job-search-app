package com.job.search.software_developer_job_notifaction_app.repository;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.job.search.software_developer_job_notifaction_app.entity.JobPosts;

@Repository
public interface JobPostsRepository extends JpaRepository<JobPosts, Integer> {
    JobPosts findById(int id);
    List<JobPosts> findByTitle(String title);
    List<JobPosts> findByCompany(String company);
    List<JobPosts> findByLocation(String location);
    List<JobPosts> findBySalary(String salary);
    List<JobPosts> findByStackName(String stackName);
    List<JobPosts> findBySourceName(String sourceName);
    List<JobPosts> findByPostedDate(Timestamp postedDate); 
}
