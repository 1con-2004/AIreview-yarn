package org.example.aireview.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.Hibernate;

import java.util.Objects;

@Getter
@Setter
@Embeddable
public class SubmissionId implements java.io.Serializable {
    private static final long serialVersionUID = -5507027585173046214L;
    @Column(name = "submission_id", nullable = false)
    private Integer submissionId;

    @Column(name = "user_id", nullable = false)
    private Integer userId;

    @Column(name = "question_id", nullable = false)
    private Integer questionId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        SubmissionId entity = (SubmissionId) o;
        return Objects.equals(this.submissionId, entity.submissionId) &&
                Objects.equals(this.questionId, entity.questionId) &&
                Objects.equals(this.userId, entity.userId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(submissionId, questionId, userId);
    }

}