

package com.common.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;

/**
 * Created by SemmEs on 04.03.2016.
 */
@Entity
public class Answer {
    private int idAnswer;
    private Date data;
    private String text;
    private int ticketsIdTickets;

    @Id
    @Column(name = "idAnswer")
    public int getIdAnswer() {
        return idAnswer;
    }

    public void setIdAnswer(int idAnswer) {
        this.idAnswer = idAnswer;
    }

    @Basic
    @Column(name = "data")
    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    @Basic
    @Column(name = "text")
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Basic
    @Column(name = "Tickets_idTickets")
    public int getTicketsIdTickets() {
        return ticketsIdTickets;
    }

    public void setTicketsIdTickets(int ticketsIdTickets) {
        this.ticketsIdTickets = ticketsIdTickets;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Answer answer = (Answer) o;

        if (idAnswer != answer.idAnswer) return false;
        if (ticketsIdTickets != answer.ticketsIdTickets) return false;
        if (data != null ? !data.equals(answer.data) : answer.data != null) return false;
        if (text != null ? !text.equals(answer.text) : answer.text != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idAnswer;
        result = 31 * result + (data != null ? data.hashCode() : 0);
        result = 31 * result + (text != null ? text.hashCode() : 0);
        result = 31 * result + ticketsIdTickets;
        return result;
    }
}
