package com.example.springmvc.repos;

import com.example.springmvc.domain.Message;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MessageRepo extends CrudRepository<Message, Integer> {

    List<Message> findByTag(String tag); //метод для поиска from JPQL snippet
}
