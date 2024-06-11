package com.illimited.ingenious.question_service.dao;

import com.illimited.ingenious.question_service.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionDao extends JpaRepository<Question, Integer> {

    List<Question> findQuestionByType(String type);

}
