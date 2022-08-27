package com.example.demo.repository;

import com.example.demo.base.BaseRepository;
import com.example.demo.entity.Question;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionRepository extends BaseRepository<Question> {
}
