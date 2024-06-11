package com.illimited.ingenious.question_service.controller;


import com.illimited.ingenious.question_service.Question;
import com.illimited.ingenious.question_service.services.QuestionService;
import jakarta.ws.rs.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("question")
public class QuestionController {

    @Autowired
    QuestionService questinService;

    @GetMapping("getAllQuestion")
    public List<Question> getAllQuestion(){
        return questinService.getAllQuestion();
    }

    @PostMapping("generate")
    List<Integer>getQuestion(@RequestParam( name="type") String type){
        System.out.println(type);
        return questinService.getQuestion(type);
    }

}
