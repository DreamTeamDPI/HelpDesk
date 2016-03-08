/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.common.service;


import com.common.entity.Answer;

import java.util.List;

/**
 *
 * @author SEMEN
 */
public interface AnswerService {
    Answer addAnswer(Answer answ);
    void delete(long id);
    Answer editAnswer(Answer answ);
    List<Answer> getAll();
}
