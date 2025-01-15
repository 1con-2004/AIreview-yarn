package org.example.aireview.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.Instant;
import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "User", schema = "AIreview")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id", nullable = false)
    private Integer id;

    @Column(name = "username", length = 25)
    private String username;

    @Column(name = "password", length = 25)
    private String password;

    @Column(name = "telphone", length = 18)
    private String telphone;

    @ColumnDefault("'normal'")
    @Lob
    @Column(name = "role")
    private String role;

    @Column(name = "register_time")
    private Instant registerTime;

    @Column(name = "last_login_time")
    private Instant lastLoginTime;

    @OneToMany(mappedBy = "user")
    private Set<StudyRecord> studyRecords = new LinkedHashSet<>();

    @OneToMany(mappedBy = "user")
    private Set<Submission> submissions = new LinkedHashSet<>();

}