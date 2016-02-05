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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "user_has_tickets", catalog = "HelpDesk", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UserHasTickets.findAll", query = "SELECT u FROM UserHasTickets u"),
    @NamedQuery(name = "UserHasTickets.findByIdUserhasTickets", query = "SELECT u FROM UserHasTickets u WHERE u.idUserhasTickets = :idUserhasTickets")})
public class UserHasTickets implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idUser_has_Tickets", nullable = false)
    private Integer idUserhasTickets;
    @JoinColumn(name = "User_idUser", referencedColumnName = "idUser")
    @ManyToOne
    private User useridUser;
    @JoinColumn(name = "Tickets_idTickets", referencedColumnName = "idTickets")
    @ManyToOne
    private Tickets ticketsidTickets;

    public UserHasTickets() {
    }

    public UserHasTickets(Integer idUserhasTickets) {
        this.idUserhasTickets = idUserhasTickets;
    }

    public Integer getIdUserhasTickets() {
        return idUserhasTickets;
    }

    public void setIdUserhasTickets(Integer idUserhasTickets) {
        this.idUserhasTickets = idUserhasTickets;
    }

    public User getUseridUser() {
        return useridUser;
    }

    public void setUseridUser(User useridUser) {
        this.useridUser = useridUser;
    }

    public Tickets getTicketsidTickets() {
        return ticketsidTickets;
    }

    public void setTicketsidTickets(Tickets ticketsidTickets) {
        this.ticketsidTickets = ticketsidTickets;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUserhasTickets != null ? idUserhasTickets.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UserHasTickets)) {
            return false;
        }
        UserHasTickets other = (UserHasTickets) object;
        if ((this.idUserhasTickets == null && other.idUserhasTickets != null) || (this.idUserhasTickets != null && !this.idUserhasTickets.equals(other.idUserhasTickets))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.common.model.UserHasTickets[ idUserhasTickets=" + idUserhasTickets + " ]";
    }
    
}
