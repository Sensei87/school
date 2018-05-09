package org.itstep.entities;

import javax.persistence.*;

/**
 * Created by ASUS on 12.02.2018.
 */
@Entity
@Table(name = "class", schema = "public", catalog = "School3")
public class Clazz {
    private int id;
    private String nameOfClass;
    private int teacherId;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name_of_class")
    public String getNameOfClass() {
        return nameOfClass;
    }

    public void setNameOfClass(String nameOfClass) {
        this.nameOfClass = nameOfClass;
    }

    @Basic
    @Column(name = "teacher_id")
    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Clazz clazz = (Clazz) o;

        if (id != clazz.id) return false;
        if (teacherId != clazz.teacherId) return false;
        if (nameOfClass != null ? !nameOfClass.equals(clazz.nameOfClass) : clazz.nameOfClass != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (nameOfClass != null ? nameOfClass.hashCode() : 0);
        result = 31 * result + teacherId;
        return result;
    }
}
