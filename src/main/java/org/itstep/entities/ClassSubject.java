package org.itstep.entities;

import javax.persistence.*;

/**
 * Created by ASUS on 12.02.2018.
 */
@Entity
@Table(name = "class_subject", schema = "public", catalog = "School3")
@IdClass(ClassSubjectPK.class)
public class ClassSubject {
    private int classId;
    private int subjectId;

    @Id
    @Column(name = "class_id")
    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    @Id
    @Column(name = "subject_id")
    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ClassSubject that = (ClassSubject) o;

        if (classId != that.classId) return false;
        if (subjectId != that.subjectId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = classId;
        result = 31 * result + subjectId;
        return result;
    }
}
