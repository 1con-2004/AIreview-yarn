package org.example.aireview.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "Study_Record", schema = "AIreview")
public class StudyRecord {
    @EmbeddedId
    private StudyRecordId id;

    @MapsId("userId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    private org.example.aireview.entity.User user;

    @MapsId("questionId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "question_id", nullable = false)
    private Question question;

    @Column(name = "is_wrong_question")
    private Byte isWrongQuestion;

    @Column(name = "study_time")
    private Instant studyTime;

    @Lob
    @Column(name = "remarks")
    private String remarks;

}