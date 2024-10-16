CREATE TABLE IF NOT EXISTS answers (
answer_id INT PRIMARY KEY,
answer VARCHAR(255)
);
CREATE TABLE IF NOT EXISTS questions (
question_id INT PRIMARY KEY,
question VARCHAR(255) NOT NULL,
linked_answer_id INT,
FOREIGN KEY (linked_answer_id) REFERENCES answers(answer_id)
);