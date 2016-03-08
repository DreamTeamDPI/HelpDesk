package com.common.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by SemmEs on 04.03.2016.
 */
@Entity
public class Deprtment {
    private int idDeprtment;
    private String departName;

    @Id
    @Column(name = "idDeprtment")
    public int getIdDeprtment() {
        return idDeprtment;
    }

    public void setIdDeprtment(int idDeprtment) {
        this.idDeprtment = idDeprtment;
    }

    @Basic
    @Column(name = "departName")
    public String getDepartName() {
        return departName;
    }

    public void setDepartName(String departName) {
        this.departName = departName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Deprtment deprtment = (Deprtment) o;

        if (idDeprtment != deprtment.idDeprtment) return false;
        if (departName != null ? !departName.equals(deprtment.departName) : deprtment.departName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idDeprtment;
        result = 31 * result + (departName != null ? departName.hashCode() : 0);
        return result;
    }
}
