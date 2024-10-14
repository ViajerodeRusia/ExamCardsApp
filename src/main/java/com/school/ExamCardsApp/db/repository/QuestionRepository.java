package com.school.ExamCardsApp.db.repository;

import com.school.ExamCardsApp.db.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Integer> {
    @Query(value = "SELECT * FROM questions ORDER BY RAND() LIMIT :amount", nativeQuery = true)
    List<Question> getRandomQuestion(@Param("amount") int amount);
}
