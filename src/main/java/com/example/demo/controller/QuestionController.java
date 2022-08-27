package com.example.demo.controller;

import com.example.demo.entity.Answer;
import com.example.demo.model.QuestionModel;
import com.example.demo.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("questions")
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    @RequestMapping(value = "", method = RequestMethod.POST)
    public QuestionModel createQuestion(@RequestBody QuestionModel questionModel) {
        return questionService.save(questionModel);
    }

    @RequestMapping(value = "/{questionId}", method = RequestMethod.GET)
    public QuestionModel getQuestionByQuestionId(@PathVariable Long questionId) {
        return questionService.getById(questionId);
    }
}
