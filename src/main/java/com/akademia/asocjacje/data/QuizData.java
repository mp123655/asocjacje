package com.akademia.asocjacje.data;


import com.akademia.asocjacje.model.quiz.Answer;
import com.akademia.asocjacje.model.quiz.Question;
import com.akademia.asocjacje.model.quiz.Test;
import com.akademia.asocjacje.reporsitory.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class QuizData implements CommandLineRunner{ //interfejs,ktory uruchamia sie kiedy wstaje aplikacja//

    @Autowired
    TestRepository testRepository;

    @Override
    public void run(String... args) throws Exception {


        Test test = new Test("About everything");
        Question question = new Question("What is The Capital of India");
        question.addAnswer(new Answer("New Delhi", true));
        question.addAnswer(new Answer("Mumbai", false));
        question.addAnswer(new Answer("Kolkatta", false));

        Question question2 = new Question("Who is CEO of Tesla Motors?");
        question2.addAnswer(new Answer("Bill Gates", false));
        question2.addAnswer(new Answer("Steve Jobs", false));
        question2.addAnswer(new Answer("Elon Musk", true));

        Question question3 = new Question("Name World's Richest Man?");
        question3.addAnswer(new Answer("Jeff Bazo", false));
        question3.addAnswer(new Answer("Bill Gates", false));
        question3.addAnswer(new Answer("Mark Zuckenberg", true));

        Question question4 = new Question("Word's Longest River?");
        question4.addAnswer(new Answer("River Nile", true));
        question4.addAnswer(new Answer("River Amazon", false));
        question4.addAnswer(new Answer("River Godavari", false));

        test.addQuestion(question);
        test.addQuestion(question2);
        test.addQuestion(question3);
        test.addQuestion(question4);
        testRepository.save(test);


    }
}
