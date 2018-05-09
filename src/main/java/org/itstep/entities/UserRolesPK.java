package org.itstep.entities;


import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class UserRolesPK implements Serializable{

    private int user_id;
    private int roles_id;

    @Id
    @Column(name = "user_id")
    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    @Id
    @Column(name = "roles_id")
    public int getRoles_id() {
        return roles_id;
    }

    public void setRoles_id(int roles_id) {
        this.roles_id = roles_id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserRolesPK that = (UserRolesPK) o;

        if (user_id != that.user_id) return false;
        return roles_id == that.roles_id;
    }

    @Override
    public int hashCode() {
        int result = user_id;
        result = 31 * result + roles_id;
        return result;
    }
}
