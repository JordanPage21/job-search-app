package com.job.search.software_developer_job_notifaction_app.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table( name="job_sources", schema="jobsearch")
@Getter
@Setter
@NoArgsConstructor 
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Sources {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "source_id")
    private int sourceId;

    @Column
    private String name;

    @Column
    private String url;
}
