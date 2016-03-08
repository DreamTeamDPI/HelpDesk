package com.common.entity;

import javax.persistence.*;

/**
 * Created by SemmEs on 04.03.2016.
 */
@Entity
@Table(name = "user_has_tickets", schema = "helpdesk", catalog = "")
public class UserHasTickets {
    private int idUserHasTickets;
    private Integer userIdUser;
    private Integer ticketsIdTickets;

    @Id
    @Column(name = "idUser_has_Tickets")
    public int getIdUserHasTickets() {
        return idUserHasTickets;
    }

    public void setIdUserHasTickets(int idUserHasTickets) {
        this.idUserHasTickets = idUserHasTickets;
    }

    @Basic
    @Column(name = "User_idUser")
    public Integer getUserIdUser() {
        return userIdUser;
    }

    public void setUserIdUser(Integer userIdUser) {
        this.userIdUser = userIdUser;
    }

    @Basic
    @Column(name = "Tickets_idTickets")
    public Integer getTicketsIdTickets() {
        return ticketsIdTickets;
    }

    public void setTicketsIdTickets(Integer ticketsIdTickets) {
        this.ticketsIdTickets = ticketsIdTickets;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserHasTickets that = (UserHasTickets) o;

        if (idUserHasTickets != that.idUserHasTickets) return false;
        if (userIdUser != null ? !userIdUser.equals(that.userIdUser) : that.userIdUser != null) return false;
        if (ticketsIdTickets != null ? !ticketsIdTickets.equals(that.ticketsIdTickets) : that.ticketsIdTickets != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idUserHasTickets;
        result = 31 * result + (userIdUser != null ? userIdUser.hashCode() : 0);
        result = 31 * result + (ticketsIdTickets != null ? ticketsIdTickets.hashCode() : 0);
        return result;
    }
}
