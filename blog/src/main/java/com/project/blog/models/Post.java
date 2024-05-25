package com.project.blog.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.yaml.snakeyaml.constructor.Construct;
import org.yaml.snakeyaml.constructor.Constructor;

@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    private String title, annonce, full_text;
    private int views;

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAnnonce() {
        return annonce;
    }
    public void setAnnonce(String annonce) {
        this.annonce = annonce;
    }
    public String getFull_text() {
        return full_text;
    }
    public void setFull_text(String full_text) {
        this.full_text = full_text;
    }
    public int getViews() {
        return views;
    }
    public void setViews(int views) {
        this.views = views;
    }
    public Post(String title, String annonce, String full_text) {
        this.title = title;
        this.annonce = annonce;
        this.full_text = full_text;
    }
    public Post() {

    }
}
