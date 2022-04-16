package com.example.demo.model;

import com.example.demo.entity.Answer;

import java.util.List;

public class QuestionModel {

    private Long questionId;
    private String question;
    private List<AnswerModel> answers;

    public Long getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Long questionId) {
        this.questionId = questionId;
    }

    public String getQuestion() {
        return question;
    }

    public List<AnswerModel> getAnswers() {
        return answers;
    }

    public void setAnswers(List<AnswerModel> answers) {
        this.answers = answers;
    }

    public void setQuestion(String question) {
        this.question = question;
    }
}
