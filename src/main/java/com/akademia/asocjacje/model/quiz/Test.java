package com.akademia.asocjacje.model.quiz;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
//@NoArgsConstructor - to 1 sposob
public class Test extends EntityBase {

    private String name;

    public Test(String name) {
        this.name = name;
    }
// 2 sposob
    public Test() {

    }

    @OneToMany (mappedBy = "test", cascade = CascadeType.ALL)
    private List<Question> questions = new ArrayList<>();


    public void addQuestion(Question question) {
        question.setTest(this);
        questions.add(question);
    }

}
