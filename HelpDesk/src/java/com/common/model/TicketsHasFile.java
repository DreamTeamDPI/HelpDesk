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
@Table(name = "tickets_has_file", catalog = "HelpDesk", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TicketsHasFile.findAll", query = "SELECT t FROM TicketsHasFile t"),
    @NamedQuery(name = "TicketsHasFile.findByIdTicketshasFile", query = "SELECT t FROM TicketsHasFile t WHERE t.idTicketshasFile = :idTicketshasFile")})
public class TicketsHasFile implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_Tickets_has_File", nullable = false)
    private Integer idTicketshasFile;
    @JoinColumn(name = "Tickets_idTickets", referencedColumnName = "idTickets", nullable = false)
    @ManyToOne(optional = false)
    private Tickets ticketsidTickets;
    @JoinColumn(name = "File_idFile", referencedColumnName = "idFile", nullable = false)
    @ManyToOne(optional = false)
    private File fileidFile;

    public TicketsHasFile() {
    }

    public TicketsHasFile(Integer idTicketshasFile) {
        this.idTicketshasFile = idTicketshasFile;
    }

    public Integer getIdTicketshasFile() {
        return idTicketshasFile;
    }

    public void setIdTicketshasFile(Integer idTicketshasFile) {
        this.idTicketshasFile = idTicketshasFile;
    }

    public Tickets getTicketsidTickets() {
        return ticketsidTickets;
    }

    public void setTicketsidTickets(Tickets ticketsidTickets) {
        this.ticketsidTickets = ticketsidTickets;
    }

    public File getFileidFile() {
        return fileidFile;
    }

    public void setFileidFile(File fileidFile) {
        this.fileidFile = fileidFile;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTicketshasFile != null ? idTicketshasFile.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TicketsHasFile)) {
            return false;
        }
        TicketsHasFile other = (TicketsHasFile) object;
        if ((this.idTicketshasFile == null && other.idTicketshasFile != null) || (this.idTicketshasFile != null && !this.idTicketshasFile.equals(other.idTicketshasFile))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.common.model.TicketsHasFile[ idTicketshasFile=" + idTicketshasFile + " ]";
    }
    
}
