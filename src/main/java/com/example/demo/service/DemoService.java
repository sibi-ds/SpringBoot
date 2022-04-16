package com.example.demo.service;

import com.example.demo.entity.Question;
import com.example.demo.repository.DemoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DemoService {

    @Autowired
    DemoRepository demoRepository;

    public List<Question> getQuestions() {
        return (List<Question>) demoRepository.findAll();
    }

    public Question createQuestion(Question question) {
        return demoRepository.save(question);
    }
}
