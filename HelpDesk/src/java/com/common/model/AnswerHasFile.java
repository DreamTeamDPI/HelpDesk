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
@Table(name = "answer_has_file", catalog = "HelpDesk", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AnswerHasFile.findAll", query = "SELECT a FROM AnswerHasFile a"),
    @NamedQuery(name = "AnswerHasFile.findByIdAnswerhasFile", query = "SELECT a FROM AnswerHasFile a WHERE a.idAnswerhasFile = :idAnswerhasFile")})
public class AnswerHasFile implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idAnswer_has_File", nullable = false)
    private Integer idAnswerhasFile;
    @JoinColumn(name = "File_idFile", referencedColumnName = "idFile", nullable = false)
    @ManyToOne(optional = false)
    private File fileidFile;
    @JoinColumn(name = "Answer_idAnswer", referencedColumnName = "idAnswer", nullable = false)
    @ManyToOne(optional = false)
    private Answer answeridAnswer;

    public AnswerHasFile() {
    }

    public AnswerHasFile(Integer idAnswerhasFile) {
        this.idAnswerhasFile = idAnswerhasFile;
    }

    public Integer getIdAnswerhasFile() {
        return idAnswerhasFile;
    }

    public void setIdAnswerhasFile(Integer idAnswerhasFile) {
        this.idAnswerhasFile = idAnswerhasFile;
    }

    public File getFileidFile() {
        return fileidFile;
    }

    public void setFileidFile(File fileidFile) {
        this.fileidFile = fileidFile;
    }

    public Answer getAnsweridAnswer() {
        return answeridAnswer;
    }

    public void setAnsweridAnswer(Answer answeridAnswer) {
        this.answeridAnswer = answeridAnswer;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAnswerhasFile != null ? idAnswerhasFile.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AnswerHasFile)) {
            return false;
        }
        AnswerHasFile other = (AnswerHasFile) object;
        if ((this.idAnswerhasFile == null && other.idAnswerhasFile != null) || (this.idAnswerhasFile != null && !this.idAnswerhasFile.equals(other.idAnswerhasFile))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.common.model.AnswerHasFile[ idAnswerhasFile=" + idAnswerhasFile + " ]";
    }
    
}
