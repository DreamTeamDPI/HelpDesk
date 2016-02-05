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
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "answer", catalog = "HelpDesk", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Answer.findAll", query = "SELECT a FROM Answer a"),
    @NamedQuery(name = "Answer.findByIdAnswer", query = "SELECT a FROM Answer a WHERE a.idAnswer = :idAnswer"),
    @NamedQuery(name = "Answer.findByData", query = "SELECT a FROM Answer a WHERE a.data = :data"),
    @NamedQuery(name = "Answer.findByText", query = "SELECT a FROM Answer a WHERE a.text = :text")})
public class Answer implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idAnswer", nullable = false)
    private Integer idAnswer;
    @Column(name = "data")
    @Temporal(TemporalType.TIMESTAMP)
    private Date data;
    @Column(name = "text", length = 200)
    private String text;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "answeridAnswer")
    private Set<AnswerHasFile> answerHasFileSet;
    @JoinColumn(name = "Tickets_idTickets", referencedColumnName = "idTickets", nullable = false)
    @ManyToOne(optional = false)
    private Tickets ticketsidTickets;

    public Answer() {
    }

    public Answer(Integer idAnswer) {
        this.idAnswer = idAnswer;
    }

    public Integer getIdAnswer() {
        return idAnswer;
    }

    public void setIdAnswer(Integer idAnswer) {
        this.idAnswer = idAnswer;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @XmlTransient
    public Set<AnswerHasFile> getAnswerHasFileSet() {
        return answerHasFileSet;
    }

    public void setAnswerHasFileSet(Set<AnswerHasFile> answerHasFileSet) {
        this.answerHasFileSet = answerHasFileSet;
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
        hash += (idAnswer != null ? idAnswer.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Answer)) {
            return false;
        }
        Answer other = (Answer) object;
        if ((this.idAnswer == null && other.idAnswer != null) || (this.idAnswer != null && !this.idAnswer.equals(other.idAnswer))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.common.model.Answer[ idAnswer=" + idAnswer + " ]";
    }
    
}
