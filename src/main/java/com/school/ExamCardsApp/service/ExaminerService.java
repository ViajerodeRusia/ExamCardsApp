package com.school.ExamCardsApp.service;

import com.school.ExamCardsApp.db.entity.Question;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public interface ExaminerService {
    Collection<Question> getQuestions(Integer amount);
    Question addQuestion(Question question);
    Question updateQuestion(Question question);
    void deleteQuestion(Question question);

}
