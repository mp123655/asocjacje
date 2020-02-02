package com.akademia.asocjacje.model.quiz;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
@Data
@NoArgsConstructor
public class Answer extends EntityBase {


    private String name;
    private boolean correct;

    @JoinColumn(name = "question_id")
    @ManyToOne
    private Question question;

    public Answer(String answerContent, boolean isCorrect) {
        this.name = answerContent;
        this.correct = isCorrect;
    }

    public boolean isCorrect() {
        return correct;
    }

}
