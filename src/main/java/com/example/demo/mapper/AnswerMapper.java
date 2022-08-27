package com.example.demo.mapper;

import com.example.demo.base.BaseMapper;
import com.example.demo.entity.Answer;
import com.example.demo.model.AnswerModel;
import org.springframework.stereotype.Component;

@Component
public class AnswerMapper implements BaseMapper<AnswerModel, Answer> {

    @Override
    public AnswerModel entityToModel(Answer answer) {
        AnswerModel answerModel = new AnswerModel();
        answerModel.setAnswerId(answer.getAnswerId());
        answerModel.setAnswer(answer.getAnswer());
        return answerModel;
    }

    @Override
    public Answer modelToEntity(AnswerModel answerModel) {
        Answer answer = new Answer();
        answer.setAnswerId(answerModel.getAnswerId());
        answer.setAnswer(answerModel.getAnswer());
        return answer;
    }
}
