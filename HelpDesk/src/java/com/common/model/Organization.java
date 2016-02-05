/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.common.model;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Konos
 */
@Entity
@Table(name = "organization", catalog = "HelpDesk", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Organization.findAll", query = "SELECT o FROM Organization o"),
    @NamedQuery(name = "Organization.findByIdOrganization", query = "SELECT o FROM Organization o WHERE o.idOrganization = :idOrganization"),
    @NamedQuery(name = "Organization.findByOrganName", query = "SELECT o FROM Organization o WHERE o.organName = :organName"),
    @NamedQuery(name = "Organization.findByAdress", query = "SELECT o FROM Organization o WHERE o.adress = :adress"),
    @NamedQuery(name = "Organization.findByOrgNomber", query = "SELECT o FROM Organization o WHERE o.orgNomber = :orgNomber")})
public class Organization implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idOrganization", nullable = false)
    private Integer idOrganization;
    @Column(name = "organName", length = 45)
    private String organName;
    @Column(name = "adress", length = 45)
    private String adress;
    @Column(name = "orgNomber", length = 45)
    private String orgNomber;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "organizationidOrganization")
    private Set<Client> clientSet;

    public Organization() {
    }

    public Organization(Integer idOrganization) {
        this.idOrganization = idOrganization;
    }

    public Integer getIdOrganization() {
        return idOrganization;
    }

    public void setIdOrganization(Integer idOrganization) {
        this.idOrganization = idOrganization;
    }

    public String getOrganName() {
        return organName;
    }

    public void setOrganName(String organName) {
        this.organName = organName;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getOrgNomber() {
        return orgNomber;
    }

    public void setOrgNomber(String orgNomber) {
        this.orgNomber = orgNomber;
    }

    @XmlTransient
    public Set<Client> getClientSet() {
        return clientSet;
    }

    public void setClientSet(Set<Client> clientSet) {
        this.clientSet = clientSet;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idOrganization != null ? idOrganization.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Organization)) {
            return false;
        }
        Organization other = (Organization) object;
        if ((this.idOrganization == null && other.idOrganization != null) || (this.idOrganization != null && !this.idOrganization.equals(other.idOrganization))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.common.model.Organization[ idOrganization=" + idOrganization + " ]";
    }
    
}
