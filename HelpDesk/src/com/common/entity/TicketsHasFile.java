package com.common.entity;

import javax.persistence.*;

/**
 * Created by SemmEs on 04.03.2016.
 */
@Entity
@Table(name = "tickets_has_file", schema = "helpdesk", catalog = "")
public class TicketsHasFile {
    private int idTicketsHasFile;
    private int ticketsIdTickets;
    private int fileIdFile;

    @Id
    @Column(name = "id_Tickets_has_File")
    public int getIdTicketsHasFile() {
        return idTicketsHasFile;
    }

    public void setIdTicketsHasFile(int idTicketsHasFile) {
        this.idTicketsHasFile = idTicketsHasFile;
    }

    @Basic
    @Column(name = "Tickets_idTickets")
    public int getTicketsIdTickets() {
        return ticketsIdTickets;
    }

    public void setTicketsIdTickets(int ticketsIdTickets) {
        this.ticketsIdTickets = ticketsIdTickets;
    }

    @Basic
    @Column(name = "File_idFile")
    public int getFileIdFile() {
        return fileIdFile;
    }

    public void setFileIdFile(int fileIdFile) {
        this.fileIdFile = fileIdFile;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TicketsHasFile that = (TicketsHasFile) o;

        if (idTicketsHasFile != that.idTicketsHasFile) return false;
        if (ticketsIdTickets != that.ticketsIdTickets) return false;
        if (fileIdFile != that.fileIdFile) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idTicketsHasFile;
        result = 31 * result + ticketsIdTickets;
        result = 31 * result + fileIdFile;
        return result;
    }
}
