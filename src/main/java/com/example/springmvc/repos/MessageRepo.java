package com.example.springmvc.repos;

import com.example.springmvc.domain.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageRepo extends CrudRepository<Message, Integer> {
}
