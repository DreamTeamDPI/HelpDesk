package com.common.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by SemmEs on 04.03.2016.
 */
@Entity
public class Employer {
    private int idEmployer;
    private int userIdUser;
    private int deprtmentIdDeprtment;

    @Id
    @Column(name = "idEmployer")
    public int getIdEmployer() {
        return idEmployer;
    }

    public void setIdEmployer(int idEmployer) {
        this.idEmployer = idEmployer;
    }

    @Basic
    @Column(name = "User_idUser")
    public int getUserIdUser() {
        return userIdUser;
    }

    public void setUserIdUser(int userIdUser) {
        this.userIdUser = userIdUser;
    }

    @Basic
    @Column(name = "Deprtment_idDeprtment")
    public int getDeprtmentIdDeprtment() {
        return deprtmentIdDeprtment;
    }

    public void setDeprtmentIdDeprtment(int deprtmentIdDeprtment) {
        this.deprtmentIdDeprtment = deprtmentIdDeprtment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employer employer = (Employer) o;

        if (idEmployer != employer.idEmployer) return false;
        if (userIdUser != employer.userIdUser) return false;
        if (deprtmentIdDeprtment != employer.deprtmentIdDeprtment) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idEmployer;
        result = 31 * result + userIdUser;
        result = 31 * result + deprtmentIdDeprtment;
        return result;
    }
}
