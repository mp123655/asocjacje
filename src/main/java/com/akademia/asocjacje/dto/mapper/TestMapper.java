package com.akademia.asocjacje.dto.mapper;

import com.akademia.asocjacje.dto.TestDto;
import com.akademia.asocjacje.model.quiz.Test;
import org.springframework.stereotype.Component;

@Component
public class TestMapper {

    private QuestionMapper questionMapper = new QuestionMapper();

    public TestDto mapToTestDto(Test test) {
        TestDto testDto= new TestDto();

        testDto.setName(test.getName());
        testDto.setQuestions(questionMapper.mapToListQuestionDto(test.getQuestions()));

        return testDto;
    }

}
