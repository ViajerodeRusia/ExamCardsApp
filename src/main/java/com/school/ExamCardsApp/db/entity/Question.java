package com.school.ExamCardsApp.db.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "questions")
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "question")
    private String question;
    @OneToOne
    @JoinColumn(name = "answer_id")
    private Answer answer;

    //TODO: Создать таблицы в БД
}
