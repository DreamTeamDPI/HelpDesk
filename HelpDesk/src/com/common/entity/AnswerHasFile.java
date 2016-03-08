package com.common.entity;

import javax.persistence.*;

/**
 * Created by SemmEs on 04.03.2016.
 */
@Entity
@Table(name = "answer_has_file", schema = "helpdesk", catalog = "")
public class AnswerHasFile {
    private int idAnswerHasFile;
    private int fileIdFile;
    private int answerIdAnswer;

    @Id
    @Column(name = "idAnswer_has_File")
    public int getIdAnswerHasFile() {
        return idAnswerHasFile;
    }

    public void setIdAnswerHasFile(int idAnswerHasFile) {
        this.idAnswerHasFile = idAnswerHasFile;
    }

    @Basic
    @Column(name = "File_idFile")
    public int getFileIdFile() {
        return fileIdFile;
    }

    public void setFileIdFile(int fileIdFile) {
        this.fileIdFile = fileIdFile;
    }

    @Basic
    @Column(name = "Answer_idAnswer")
    public int getAnswerIdAnswer() {
        return answerIdAnswer;
    }

    public void setAnswerIdAnswer(int answerIdAnswer) {
        this.answerIdAnswer = answerIdAnswer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AnswerHasFile that = (AnswerHasFile) o;

        if (idAnswerHasFile != that.idAnswerHasFile) return false;
        if (fileIdFile != that.fileIdFile) return false;
        if (answerIdAnswer != that.answerIdAnswer) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idAnswerHasFile;
        result = 31 * result + fileIdFile;
        result = 31 * result + answerIdAnswer;
        return result;
    }
}
