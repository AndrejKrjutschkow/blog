package com.bodree.blog.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Post{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title, anounce, fullText;
    private int views;

    public Post() {
    }

    public Post(String title, String anounce, String fullText) {
        this.title = title;
        this.anounce = anounce;
        this.fullText = fullText;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAnounce() {
        return anounce;
    }

    public void setAnounce(String anounce) {
        this.anounce = anounce;
    }

    public String getFullText() {
        return fullText;
    }

    public void setFullText(String fullText) {
        this.fullText = fullText;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }
}
