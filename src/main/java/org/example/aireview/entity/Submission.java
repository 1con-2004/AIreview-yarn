package org.example.aireview.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "Submission", schema = "AIreview")
public class Submission {
    @EmbeddedId
    private SubmissionId id;

    @MapsId("userId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    private org.example.aireview.entity.User user;

    @MapsId("questionId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "question_id", nullable = false)
    private Question question;

    @Lob
    @Column(name = "submitted_code")
    private String submittedCode;

    @Column(name = "submission_time")
    private Instant submissionTime;

    @Lob
    @Column(name = "review_result")
    private String reviewResult;

    @Lob
    @Column(name = "ai_explanation")
    private String aiExplanation;

}