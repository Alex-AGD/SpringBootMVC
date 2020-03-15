package com.example.testregik.repos;

import com.example.testregik.domain.Message;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MessageRepo extends CrudRepository<Message, Integer> {

    List<Message> findByTag(String tag); //метод для поиска from JPQL snippet
}
