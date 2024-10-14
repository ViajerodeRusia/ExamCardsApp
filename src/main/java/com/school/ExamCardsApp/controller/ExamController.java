package com.school.ExamCardsApp.controller;

import com.school.ExamCardsApp.db.entity.Question;
import com.school.ExamCardsApp.service.ExaminerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
@RestController
@RequestMapping("/exam")
public class ExamController {
    private final ExaminerService examinerService;

    public ExamController(ExaminerService examinerService) {
        this.examinerService = examinerService;
    }
    @GetMapping
    public ResponseEntity<Collection<Question>> getQuestions(@RequestParam ("amount") Integer amount) {
        return ResponseEntity.ok(examinerService.getQuestions(amount));
    }
}
