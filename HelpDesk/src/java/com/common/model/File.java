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
@Table(name = "file", catalog = "HelpDesk", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "File.findAll", query = "SELECT f FROM File f"),
    @NamedQuery(name = "File.findByIdFile", query = "SELECT f FROM File f WHERE f.idFile = :idFile"),
    @NamedQuery(name = "File.findByName", query = "SELECT f FROM File f WHERE f.name = :name"),
    @NamedQuery(name = "File.findByFormat", query = "SELECT f FROM File f WHERE f.format = :format"),
    @NamedQuery(name = "File.findByFileHash", query = "SELECT f FROM File f WHERE f.fileHash = :fileHash"),
    @NamedQuery(name = "File.findByFileSize", query = "SELECT f FROM File f WHERE f.fileSize = :fileSize")})
public class File implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idFile", nullable = false)
    private Integer idFile;
    @Column(name = "name", length = 45)
    private String name;
    @Column(name = "format", length = 10)
    private String format;
    @Column(name = "file_hash", length = 512)
    private String fileHash;
    @Column(name = "file_size", length = 11)
    private String fileSize;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fileidFile")
    private Set<AnswerHasFile> answerHasFileSet;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fileidFile")
    private Set<TicketsHasFile> ticketsHasFileSet;

    public File() {
    }

    public File(Integer idFile) {
        this.idFile = idFile;
    }

    public Integer getIdFile() {
        return idFile;
    }

    public void setIdFile(Integer idFile) {
        this.idFile = idFile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getFileHash() {
        return fileHash;
    }

    public void setFileHash(String fileHash) {
        this.fileHash = fileHash;
    }

    public String getFileSize() {
        return fileSize;
    }

    public void setFileSize(String fileSize) {
        this.fileSize = fileSize;
    }

    @XmlTransient
    public Set<AnswerHasFile> getAnswerHasFileSet() {
        return answerHasFileSet;
    }

    public void setAnswerHasFileSet(Set<AnswerHasFile> answerHasFileSet) {
        this.answerHasFileSet = answerHasFileSet;
    }

    @XmlTransient
    public Set<TicketsHasFile> getTicketsHasFileSet() {
        return ticketsHasFileSet;
    }

    public void setTicketsHasFileSet(Set<TicketsHasFile> ticketsHasFileSet) {
        this.ticketsHasFileSet = ticketsHasFileSet;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idFile != null ? idFile.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof File)) {
            return false;
        }
        File other = (File) object;
        if ((this.idFile == null && other.idFile != null) || (this.idFile != null && !this.idFile.equals(other.idFile))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.common.model.File[ idFile=" + idFile + " ]";
    }
    
}
