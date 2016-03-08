package com.common.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by SemmEs on 04.03.2016.
 */
@Entity
public class File {
    private int idFile;
    private String name;
    private String format;
    private String fileHash;
    private String fileSize;

    @Id
    @Column(name = "idFile")
    public int getIdFile() {
        return idFile;
    }

    public void setIdFile(int idFile) {
        this.idFile = idFile;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "format")
    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    @Basic
    @Column(name = "file_hash")
    public String getFileHash() {
        return fileHash;
    }

    public void setFileHash(String fileHash) {
        this.fileHash = fileHash;
    }

    @Basic
    @Column(name = "file_size")
    public String getFileSize() {
        return fileSize;
    }

    public void setFileSize(String fileSize) {
        this.fileSize = fileSize;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        File file = (File) o;

        if (idFile != file.idFile) return false;
        if (name != null ? !name.equals(file.name) : file.name != null) return false;
        if (format != null ? !format.equals(file.format) : file.format != null) return false;
        if (fileHash != null ? !fileHash.equals(file.fileHash) : file.fileHash != null) return false;
        if (fileSize != null ? !fileSize.equals(file.fileSize) : file.fileSize != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idFile;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (format != null ? format.hashCode() : 0);
        result = 31 * result + (fileHash != null ? fileHash.hashCode() : 0);
        result = 31 * result + (fileSize != null ? fileSize.hashCode() : 0);
        return result;
    }
}
