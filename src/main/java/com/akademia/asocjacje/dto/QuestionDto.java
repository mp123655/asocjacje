package com.akademia.asocjacje.dto;


import lombok.Data;

import java.util.ArrayList;
import java.util.List;
//DTO z 3 tabel pozbieralismy rozne wartosci i wrzucilismy w 1 obieky
@Data
public class QuestionDto {

    private Long id;
    private String content;
    private List<String> options = new ArrayList<>();
    private String answer;

    public QuestionDto(String content) {
        this.content = content;
    }
}
