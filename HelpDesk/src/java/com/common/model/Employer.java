/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.common.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Konos
 */
@Entity
@Table(name = "employer", catalog = "HelpDesk", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Employer.findAll", query = "SELECT e FROM Employer e"),
    @NamedQuery(name = "Employer.findByIdEmployer", query = "SELECT e FROM Employer e WHERE e.idEmployer = :idEmployer")})
public class Employer implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idEmployer", nullable = false)
    private Integer idEmployer;
    @JoinColumn(name = "User_idUser", referencedColumnName = "idUser", nullable = false)
    @ManyToOne(optional = false)
    private User useridUser;
    @JoinColumn(name = "Deprtment_idDeprtment", referencedColumnName = "idDeprtment", nullable = false)
    @ManyToOne(optional = false)
    private Deprtment deprtmentidDeprtment;

    public Employer() {
    }

    public Employer(Integer idEmployer) {
        this.idEmployer = idEmployer;
    }

    public Integer getIdEmployer() {
        return idEmployer;
    }

    public void setIdEmployer(Integer idEmployer) {
        this.idEmployer = idEmployer;
    }

    public User getUseridUser() {
        return useridUser;
    }

    public void setUseridUser(User useridUser) {
        this.useridUser = useridUser;
    }

    public Deprtment getDeprtmentidDeprtment() {
        return deprtmentidDeprtment;
    }

    public void setDeprtmentidDeprtment(Deprtment deprtmentidDeprtment) {
        this.deprtmentidDeprtment = deprtmentidDeprtment;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEmployer != null ? idEmployer.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Employer)) {
            return false;
        }
        Employer other = (Employer) object;
        if ((this.idEmployer == null && other.idEmployer != null) || (this.idEmployer != null && !this.idEmployer.equals(other.idEmployer))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.common.model.Employer[ idEmployer=" + idEmployer + " ]";
    }
    
}
