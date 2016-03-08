package com.common.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by SemmEs on 04.03.2016.
 */
@Entity
public class Client {
    private int idClient;
    private int userIdUser;
    private int organizationIdOrganization;

    @Id
    @Column(name = "idClient")
    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
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
    @Column(name = "Organization_idOrganization")
    public int getOrganizationIdOrganization() {
        return organizationIdOrganization;
    }

    public void setOrganizationIdOrganization(int organizationIdOrganization) {
        this.organizationIdOrganization = organizationIdOrganization;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Client client = (Client) o;

        if (idClient != client.idClient) return false;
        if (userIdUser != client.userIdUser) return false;
        if (organizationIdOrganization != client.organizationIdOrganization) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idClient;
        result = 31 * result + userIdUser;
        result = 31 * result + organizationIdOrganization;
        return result;
    }
}
