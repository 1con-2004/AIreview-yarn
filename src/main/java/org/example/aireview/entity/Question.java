package org.example.aireview.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;
import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "Question", schema = "AIreview")
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "question_id", nullable = false)
    private Integer id;

    @Lob
    @Column(name = "question_content")
    private String questionContent;

    @Column(name = "question_type", length = 10)
    private String questionType;

    @Column(name = "programming_language", length = 10)
    private String programmingLanguage;

    @Lob
    @Column(name = "difficulty_level")
    private String difficultyLevel;

    @Lob
    @Column(name = "answer")
    private String answer;

    @Column(name = "create_time")
    private Instant createTime;

    @Column(name = "update_time")
    private Instant updateTime;

    @OneToMany(mappedBy = "question")
    private Set<org.example.aireview.entity.StudyRecord> studyRecords = new LinkedHashSet<>();

    @OneToMany(mappedBy = "question")
    private Set<org.example.aireview.entity.Submission> submissions = new LinkedHashSet<>();

}