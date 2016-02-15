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
@Table(name = "deprtment", catalog = "HelpDesk", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Deprtment.findAll", query = "SELECT d FROM Deprtment d"),
    @NamedQuery(name = "Deprtment.findByIdDeprtment", query = "SELECT d FROM Deprtment d WHERE d.idDeprtment = :idDeprtment"),
    @NamedQuery(name = "Deprtment.findByDepartName", query = "SELECT d FROM Deprtment d WHERE d.departName = :departName")})
public class Deprtment implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idDeprtment", nullable = false)
    private Long idDeprtment;
    @Column(name = "departName", length = 45)
    private String departName;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "deprtmentidDeprtment")
    private Set<Employer> employerSet;

    public Deprtment() {
    }

    public Deprtment(Long idDeprtment) {
        this.idDeprtment = idDeprtment;
    }

    public Long getIdDeprtment() {
        return idDeprtment;
    }

    public void setIdDeprtment(Long idDeprtment) {
        this.idDeprtment = idDeprtment;
    }

    public String getDepartName() {
        return departName;
    }

    public void setDepartName(String departName) {
        this.departName = departName;
    }

    @XmlTransient
    public Set<Employer> getEmployerSet() {
        return employerSet;
    }

    public void setEmployerSet(Set<Employer> employerSet) {
        this.employerSet = employerSet;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDeprtment != null ? idDeprtment.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Deprtment)) {
            return false;
        }
        Deprtment other = (Deprtment) object;
        if ((this.idDeprtment == null && other.idDeprtment != null) || (this.idDeprtment != null && !this.idDeprtment.equals(other.idDeprtment))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.common.model.Deprtment[ idDeprtment=" + idDeprtment + " ]";
    }
    
}
