package com.common.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by SemmEs on 04.03.2016.
 */
@Entity
public class Tickets {
    private int idTickets;
    private String subject;
    private String discribe;
    private String status;
    private String priority;

    @Id
    @Column(name = "idTickets")
    public int getIdTickets() {
        return idTickets;
    }

    public void setIdTickets(int idTickets) {
        this.idTickets = idTickets;
    }

    @Basic
    @Column(name = "subject")
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Basic
    @Column(name = "discribe")
    public String getDiscribe() {
        return discribe;
    }

    public void setDiscribe(String discribe) {
        this.discribe = discribe;
    }

    @Basic
    @Column(name = "status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "priority")
    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tickets tickets = (Tickets) o;

        if (idTickets != tickets.idTickets) return false;
        if (subject != null ? !subject.equals(tickets.subject) : tickets.subject != null) return false;
        if (discribe != null ? !discribe.equals(tickets.discribe) : tickets.discribe != null) return false;
        if (status != null ? !status.equals(tickets.status) : tickets.status != null) return false;
        if (priority != null ? !priority.equals(tickets.priority) : tickets.priority != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idTickets;
        result = 31 * result + (subject != null ? subject.hashCode() : 0);
        result = 31 * result + (discribe != null ? discribe.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (priority != null ? priority.hashCode() : 0);
        return result;
    }
}
