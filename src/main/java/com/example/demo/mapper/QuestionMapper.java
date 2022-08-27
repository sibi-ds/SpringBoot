package com.example.demo.mapper;

import com.example.demo.base.BaseMapper;
import com.example.demo.entity.Question;
import com.example.demo.model.QuestionModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
public class QuestionMapper implements BaseMapper<QuestionModel, Question> {

    @Autowired
    private AnswerMapper answerMapper;

    @Override
    public Question modelToEntity(QuestionModel questionModel) {
        Question question = new Question();
        question.setQuestionId(questionModel.getQuestionId());
        question.setQuestion(questionModel.getQuestion());
        if (null != questionModel.getAnswers()) {
            question.setAnswers(questionModel.getAnswers().stream()
                    .map(answerModel -> answerMapper.modelToEntity(answerModel))
                    .collect(Collectors.toList()));
        }
        return question;
    }

    @Override
    public QuestionModel entityToModel(Question question) {
        QuestionModel questionModel = new QuestionModel();
        questionModel.setQuestionId(question.getQuestionId());
        questionModel.setQuestion(question.getQuestion());
        if (null != question.getAnswers()) {
            questionModel.setAnswers(question.getAnswers().stream()
                    .map(answer -> answerMapper.entityToModel(answer))
                    .collect(Collectors.toList()));
        }
        return questionModel;
    }
}
