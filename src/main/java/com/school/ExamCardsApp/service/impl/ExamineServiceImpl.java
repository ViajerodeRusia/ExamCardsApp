package com.school.ExamCardsApp.service.impl;

import com.school.ExamCardsApp.db.entity.Question;
import com.school.ExamCardsApp.db.repository.QuestionRepository;
import com.school.ExamCardsApp.service.ExaminerService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
@Service
public class ExamineServiceImpl implements ExaminerService {
    private final QuestionRepository questionRepository;

    public ExamineServiceImpl(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    @Override
    public Collection<Question> getQuestions(Integer amount) {
        return questionRepository.getRandomQuestion(amount);
    }

    @Override
    public Question addQuestion(Question question) {
        return questionRepository.save(question);
    }

    @Override
    public Question updateQuestion(Question question) {
        return questionRepository.save(question);
    }

    @Override
    public void deleteQuestion(Question question) {
        questionRepository.delete(question);
    }
}
