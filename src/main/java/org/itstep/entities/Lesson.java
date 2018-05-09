package org.itstep.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;

/**
 * Created by ASUS on 12.02.2018.
 */
@Entity
public class Lesson {
    private int id;
    private int classId;
    private int teachersId;
    private int subjectId;
    private int pupilId;
    private Date day;
    private boolean visit;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "class_id")
    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    @Basic
    @Column(name = "teachers_id")
    public int getTeachersId() {
        return teachersId;
    }

    public void setTeachersId(int teachersId) {
        this.teachersId = teachersId;
    }

    @Basic
    @Column(name = "subject_id")
    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    @Basic
    @Column(name = "pupil_id")
    public int getPupilId() {
        return pupilId;
    }

    public void setPupilId(int pupilId) {
        this.pupilId = pupilId;
    }

    @Basic
    @Column(name = "day")
    public Date getDay() {
        return day;
    }

    public void setDay(Date day) {
        this.day = day;
    }

    @Basic
    @Column(name = "visit")
    public boolean isVisit() {
        return visit;
    }

    public void setVisit(boolean visit) {
        this.visit = visit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Lesson lesson = (Lesson) o;

        if (id != lesson.id) return false;
        if (classId != lesson.classId) return false;
        if (teachersId != lesson.teachersId) return false;
        if (subjectId != lesson.subjectId) return false;
        if (pupilId != lesson.pupilId) return false;
        if (visit != lesson.visit) return false;
        if (day != null ? !day.equals(lesson.day) : lesson.day != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + classId;
        result = 31 * result + teachersId;
        result = 31 * result + subjectId;
        result = 31 * result + pupilId;
        result = 31 * result + (day != null ? day.hashCode() : 0);
        result = 31 * result + (visit ? 1 : 0);
        return result;
    }
}
