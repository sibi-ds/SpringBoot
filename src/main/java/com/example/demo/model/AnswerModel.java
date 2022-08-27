package com.example.demo.model;

import com.example.demo.base.BaseModel;

public class AnswerModel extends BaseModel {

    private Long answerId;

    private String answer;

    public Long getAnswerId() {
        return answerId;
    }

    public void setAnswerId(Long answerId) {
        this.answerId = answerId;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

}
