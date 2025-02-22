package com.job.search.software_developer_job_notifaction_app.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table( name="user_preferences", schema="jobsearch")
@Getter
@Setter
@NoArgsConstructor 
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class UserPreferences {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    @Column( name="id")
    private int id;
    
    @OneToOne
    @JoinColumn( name="user_id", referencedColumnName="user_id", nullable = false)
    private Users user;

    @OneToOne
    @JoinColumn( name="stack_id", referencedColumnName="stack_id")
    private Stack stack;

    @Column
    private String location;

    @Column( name="job_title")
    private String jobTitle;

    @Column( name="job_salary")
    private String jobSalary;
}
