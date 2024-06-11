package com.illimited.ingenious.question_service.services;


import com.illimited.ingenious.question_service.Question;
import com.illimited.ingenious.question_service.dao.QuestionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class QuestionService {

    @Autowired
    QuestionDao questionDao;

    public List<Question> getAllQuestion(){

        return questionDao.findAll();
    }

    public List<Integer> getQuestion(String type) {
        List<Question> qsList = questionDao.findQuestionByType(type);
        System.out.println(qsList);
        List<Integer> list = qsList.stream().map( m -> m.getId()).collect(Collectors.toList());
        System.out.println(list);
        return list;

    }
}
