package com.illimited.ingenious.quiz_service;

import com.illimited.ingenious.quiz_service.fiegn.QuizInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("quiz")
public class quizController {

    @Autowired
    QuizInterface quizI;

    @PostMapping("generate")
    List<Integer> getQuestion(@RequestParam( name="type") String type){
        System.out.println(type);
        return quizI.getQuestion(type);
    }

}
