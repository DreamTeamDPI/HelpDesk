/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.common.model;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Konos
 */
@Entity
@Table(name = "tickets", catalog = "HelpDesk", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tickets.findAll", query = "SELECT t FROM Tickets t"),
    @NamedQuery(name = "Tickets.findByIdTickets", query = "SELECT t FROM Tickets t WHERE t.idTickets = :idTickets"),
    @NamedQuery(name = "Tickets.findBySubject", query = "SELECT t FROM Tickets t WHERE t.subject = :subject"),
    @NamedQuery(name = "Tickets.findByDiscribe", query = "SELECT t FROM Tickets t WHERE t.discribe = :discribe"),
    @NamedQuery(name = "Tickets.findByStatus", query = "SELECT t FROM Tickets t WHERE t.status = :status"),
    @NamedQuery(name = "Tickets.findByPriority", query = "SELECT t FROM Tickets t WHERE t.priority = :priority"),
    @NamedQuery(name = "Tickets.findByComeDate", query = "SELECT t FROM Tickets t WHERE t.comeDate = :comeDate"),
    @NamedQuery(name = "Tickets.findByStarDate", query = "SELECT t FROM Tickets t WHERE t.starDate = :starDate"),
    @NamedQuery(name = "Tickets.findByEndDate", query = "SELECT t FROM Tickets t WHERE t.endDate = :endDate")})
public class Tickets implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idTickets", nullable = false)
    private Integer idTickets;
    @Basic(optional = false)
    @Column(name = "subject", nullable = false, length = 45)
    private String subject;
    @Column(name = "discribe", length = 1000)
    private String discribe;
    @Column(name = "status", length = 45)
    private String status;
    @Column(name = "priority", length = 45)
    private String priority;
    @Column(name = "comeDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date comeDate;
    @Column(name = "starDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date starDate;
    @Column(name = "endDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date endDate;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ticketsidTickets")
    private Set<TicketsHasFile> ticketsHasFileSet;
    @OneToMany(mappedBy = "ticketsidTickets")
    private Set<UserHasTickets> userHasTicketsSet;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ticketsidTickets")
    private Set<Answer> answerSet;

    public Tickets() {
    }

    public Tickets(Integer idTickets) {
        this.idTickets = idTickets;
    }

    public Tickets(Integer idTickets, String subject) {
        this.idTickets = idTickets;
        this.subject = subject;
    }

    public Integer getIdTickets() {
        return idTickets;
    }

    public void setIdTickets(Integer idTickets) {
        this.idTickets = idTickets;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getDiscribe() {
        return discribe;
    }

    public void setDiscribe(String discribe) {
        this.discribe = discribe;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public Date getComeDate() {
        return comeDate;
    }

    public void setComeDate(Date comeDate) {
        this.comeDate = comeDate;
    }

    public Date getStarDate() {
        return starDate;
    }

    public void setStarDate(Date starDate) {
        this.starDate = starDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    @XmlTransient
    public Set<TicketsHasFile> getTicketsHasFileSet() {
        return ticketsHasFileSet;
    }

    public void setTicketsHasFileSet(Set<TicketsHasFile> ticketsHasFileSet) {
        this.ticketsHasFileSet = ticketsHasFileSet;
    }

    @XmlTransient
    public Set<UserHasTickets> getUserHasTicketsSet() {
        return userHasTicketsSet;
    }

    public void setUserHasTicketsSet(Set<UserHasTickets> userHasTicketsSet) {
        this.userHasTicketsSet = userHasTicketsSet;
    }

    @XmlTransient
    public Set<Answer> getAnswerSet() {
        return answerSet;
    }

    public void setAnswerSet(Set<Answer> answerSet) {
        this.answerSet = answerSet;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTickets != null ? idTickets.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tickets)) {
            return false;
        }
        Tickets other = (Tickets) object;
        if ((this.idTickets == null && other.idTickets != null) || (this.idTickets != null && !this.idTickets.equals(other.idTickets))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.common.model.Tickets[ idTickets=" + idTickets + " ]";
    }
    
}
