package com.job.search.software_developer_job_notifaction_app.entity;

import java.sql.Timestamp;

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
@Table( name="job_posts")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class JobPosts {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column( name="job_id", nullable = false)
    private int jobId;

    @Column( nullable = false)
    private String title;

    @Column( nullable = false)
    private String company;

    @Column
    private String location;

    @Column
    private String salary;

    @OneToOne
    @JoinColumn( name="stack_id", referencedColumnName="stack_id")
    private Stack stack;

    @Column( name="job_url", nullable = false)
    private String jobUrl;

    @OneToOne
    @JoinColumn( name="source_id", referencedColumnName="source_id", nullable = false)
    private Sources source;

    @Column( name="posted_date")
    private Timestamp postedDate;

    @Column( name="created_at")
    private Timestamp createdAt;
}
