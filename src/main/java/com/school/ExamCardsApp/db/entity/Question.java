package com.school.ExamCardsApp.db.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CollectionId;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "questions")
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "question_id")
    private Integer id;
    @Column(name = "question")
    private String question;
    @OneToOne(optional = true)
    @JoinColumn(name = "linked_answer_id")
    private Answer answer;
}
