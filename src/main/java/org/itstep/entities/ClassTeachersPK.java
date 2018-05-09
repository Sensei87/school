package org.itstep.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;


public class ClassTeachersPK implements Serializable {
    private int teachersId;
    private int classId;

    @Column(name = "teachers_id")
    @Id
    public int getTeachersId() {
        return teachersId;
    }

    public void setTeachersId(int teachersId) {
        this.teachersId = teachersId;
    }

    @Column(name = "class_id")
    @Id
    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ClassTeachersPK that = (ClassTeachersPK) o;

        if (teachersId != that.teachersId) return false;
        if (classId != that.classId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = teachersId;
        result = 31 * result + classId;
        return result;
    }
}
