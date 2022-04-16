package com.example.demo.controller;

import com.example.demo.entity.Question;
import com.example.demo.model.QuestionModel;
import com.example.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DemoController {

    @Autowired
    DemoService demoService;

    @GetMapping("questions")
    public List<Question> getQuestions() {
        return demoService.getQuestions();
    }

    @PostMapping("questions")
    public Question createQuestion(@RequestBody Question question) {
        return demoService.createQuestion(question);
    }
}
