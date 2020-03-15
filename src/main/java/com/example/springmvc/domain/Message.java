package com.example.springmvc.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity //аннтоция показывает spring что эта сущность которую необходимо сохр. в БД
public class Message {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    private String text;
    private String tag;

    public Message() {
    }

    public Message(String text, String tag) {
        this.text = text;
        this.tag = tag;
    }

    public String getText() {
        return text;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getTag() {
        return tag;

    }

}
