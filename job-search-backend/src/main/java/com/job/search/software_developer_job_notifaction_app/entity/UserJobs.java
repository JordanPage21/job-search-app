package com.job.search.software_developer_job_notifaction_app.entity;

import com.job.search.software_developer_job_notifaction_app.enums.JobStatus;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="user_jobs")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class UserJobs {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private int id;
    
    @ManyToOne
    @JoinColumn( name="user_id", referencedColumnName="user_id")
    private Users user;

    @ManyToOne 
    @JoinColumn( name="job_id", referencedColumnName="job_id")
    private JobPosts job;

    @Column
    private JobStatus status;
}
