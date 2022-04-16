package com.example.demo.mapper;

import com.example.demo.entity.Answer;
import com.example.demo.entity.Question;
import com.example.demo.model.QuestionModel;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class QuestionMapper {

    public QuestionModel entityToModel(Question question) {
        QuestionModel questionModel = new QuestionModel();
        questionModel.setQuestionId(question.getQuestionId());
        questionModel.setQuestion(question.getQuestion());
        //questionModel.setAnswers(question.getAnswers());
        return questionModel;
    }

    public Question modelToEntity(QuestionModel questionModel) {
        Question question = new Question();
        question.setQuestion(questionModel.getQuestion());

        AnswerMapper answerMapper = new AnswerMapper();
        List<Answer> answers = new ArrayList<>();
        questionModel.getAnswers().forEach(answerModel -> {
            answers.add(answerMapper.modelToEntity(answerModel));
        });

        //question.setAnswers(questionModel.getAnswers());
        return question;
    }
}
