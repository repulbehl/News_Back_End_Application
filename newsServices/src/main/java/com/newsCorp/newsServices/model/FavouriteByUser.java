package com.newsCorp.newsServices.model;

import com.newsCorp.newsServices.entity.Comment;
import jakarta.persistence.Column;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

@Component
public class FavouriteByUser {

    public String title;
    public String content;
    public String author;
    public List<String> category;
    public Date publishedDate;
    public String fullDescription;
    public  String imageUrl;
    public   String language;
    public int likes;
    public int userId; // To be used when the user module is ready
    public List<Comment> comments;
}
