package com.common.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by SemmEs on 04.03.2016.
 */
@Entity
public class Organization {
    private int idOrganization;
    private String organName;
    private String adress;
    private String orgNomber;

    @Id
    @Column(name = "idOrganization")
    public int getIdOrganization() {
        return idOrganization;
    }

    public void setIdOrganization(int idOrganization) {
        this.idOrganization = idOrganization;
    }

    @Basic
    @Column(name = "organName")
    public String getOrganName() {
        return organName;
    }

    public void setOrganName(String organName) {
        this.organName = organName;
    }

    @Basic
    @Column(name = "adress")
    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Basic
    @Column(name = "orgNomber")
    public String getOrgNomber() {
        return orgNomber;
    }

    public void setOrgNomber(String orgNomber) {
        this.orgNomber = orgNomber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Organization that = (Organization) o;

        if (idOrganization != that.idOrganization) return false;
        if (organName != null ? !organName.equals(that.organName) : that.organName != null) return false;
        if (adress != null ? !adress.equals(that.adress) : that.adress != null) return false;
        if (orgNomber != null ? !orgNomber.equals(that.orgNomber) : that.orgNomber != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idOrganization;
        result = 31 * result + (organName != null ? organName.hashCode() : 0);
        result = 31 * result + (adress != null ? adress.hashCode() : 0);
        result = 31 * result + (orgNomber != null ? orgNomber.hashCode() : 0);
        return result;
    }
}
