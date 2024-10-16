package com.school.ExamCardsApp.controller;

import com.school.ExamCardsApp.db.entity.Question;
import com.school.ExamCardsApp.service.ExaminerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/questions")
public class QuestionController {
    private final ExaminerService examinerService;

    public QuestionController(ExaminerService examinerService) {
        this.examinerService = examinerService;
    }

    @PostMapping
    private ResponseEntity<Question> addQuestion(@RequestBody Question question) {
        return ResponseEntity.ok(examinerService.addQuestion(question));
    }
    @DeleteMapping
    private ResponseEntity<Question> deleteQuestion(@RequestBody Question question) {
        examinerService.deleteQuestion(question);
        return ResponseEntity.ok(question);
    }
}
