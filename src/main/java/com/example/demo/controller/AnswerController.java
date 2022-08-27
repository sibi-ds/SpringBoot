package com.example.demo.controller;

import com.example.demo.entity.Answer;
import com.example.demo.model.AnswerModel;
import com.example.demo.model.QuestionModel;
import com.example.demo.service.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("answers")
public class AnswerController {

    @Autowired
    private AnswerService answerService;

    @RequestMapping(value = "", method = RequestMethod.POST)
    public AnswerModel createQuestion(@RequestBody AnswerModel answerModel) {
        return answerService.save(answerModel);
    }
}
