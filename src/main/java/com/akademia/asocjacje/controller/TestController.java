package com.akademia.asocjacje.controller;


import com.akademia.asocjacje.dto.TestDto;
import com.akademia.asocjacje.dto.mapper.TestMapper;
import com.akademia.asocjacje.reporsitory.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController // zwraca JSON, a zwykly controller HTML. Rest zwraca dane  a zwykly zwraca widok.
@CrossOrigin  // nie blokuje zapytan z zewnatrz
@RequestMapping  ("/tests") // kazde z zapytamie z adresu /tests trafi do tego kontrolera.

public class TestController {

    @Autowired // wstrzykujemy zaleznosci (bean)
    private TestMapper testMapper;

    @Autowired
    private TestRepository testRepository;

    @GetMapping("/{id}") // przyjmuje requesty typu get
    @ResponseBody
    public TestDto sayHello(@PathVariable Long id) {
        return testMapper.mapToTestDto(testRepository.findById(id).get());
    }
}
