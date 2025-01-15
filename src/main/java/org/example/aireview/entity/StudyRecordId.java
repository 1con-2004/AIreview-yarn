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
public class StudyRecordId implements java.io.Serializable {
    private static final long serialVersionUID = 7620535038872511173L;
    @Column(name = "record_id", nullable = false)
    private Integer recordId;

    @Column(name = "user_id", nullable = false)
    private Integer userId;

    @Column(name = "question_id", nullable = false)
    private Integer questionId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        StudyRecordId entity = (StudyRecordId) o;
        return Objects.equals(this.recordId, entity.recordId) &&
                Objects.equals(this.questionId, entity.questionId) &&
                Objects.equals(this.userId, entity.userId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recordId, questionId, userId);
    }

}