package com.job.search.software_developer_job_notifaction_app.entity;

import java.sql.Timestamp;

import org.hibernate.annotations.CreationTimestamp;

import com.job.search.software_developer_job_notifaction_app.enums.NotificationFrequency;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
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
@Table(name="users")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Users {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column( name="user_id")
    private int id;

    @Column( name="first_name", nullable = false)
    private String firstName;

    @Column( name="last_name", nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String email;

    @Column( name="password_hash", nullable = false)
    private String password;

    @Column ( name="notification_frequency")
    @Enumerated(EnumType.STRING)
    private NotificationFrequency notificationFrequency;

    @CreationTimestamp
    @Column (name="created_at")
    private Timestamp createdAt;
}
