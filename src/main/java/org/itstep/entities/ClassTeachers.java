package org.itstep.entities;

import javax.persistence.*;


@Entity
@Table(name = "class_teachers", schema = "public", catalog = "School3")
@IdClass(ClassTeachersPK.class)
public class ClassTeachers {
    private int teachersId;
    private int classId;

    @Id
    @Column(name = "teachers_id")
    public int getTeachersId() {
        return teachersId;
    }

    public void setTeachersId(int teachersId) {
        this.teachersId = teachersId;
    }

    @Id
    @Column(name = "class_id")
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

        ClassTeachers that = (ClassTeachers) o;

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
