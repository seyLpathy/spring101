package com.example.nativeInterface;

import org.springframework.stereotype.Component;

@Component
public class comment {
    private String author;
    private String text;

    public String getAuthor() {
        return author;
    }

    public String getText() {
        return text;
    }
    public void setAuthor(String author) {
        this.author=author;
    }
    public void setText(String text) {
        this.text=text;
    }
}
