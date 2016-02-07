/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.common.service.impl;

import com.common.model.Answer;
import com.common.repository.AnswerRepository;
import com.common.service.AnswerService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author SEMEN
 */
@Service
public class AnswerServiceImpl implements AnswerService {

    @Autowired
    AnswerRepository answRepository;
    
    @Override
    public Answer addAnswer(Answer answ) {
        Answer answer = answRepository.saveAndFlush(answ);
        return answer;
    }

    @Override
    public void delete(long id) {
        answRepository.delete(id);
    }

    @Override
    public Answer editAnswer(Answer answ) {
        return answRepository.saveAndFlush(answ);
    }

    @Override
    public List<Answer> getAll() {
        return answRepository.findAll();
    }
    
}
