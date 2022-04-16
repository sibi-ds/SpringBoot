package com.example.demo.repository;

import com.example.demo.entity.Question;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DemoRepository extends CrudRepository<Question, Integer> {
}
