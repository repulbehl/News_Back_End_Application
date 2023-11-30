package com.newsCorp.newsServices.model;

import com.newsCorp.newsServices.entity.Comment;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

@Component
public class FavouriteByUser {
    private Long id;
    private String title;
    private String content;
    private String author;
    private String category;
    private Date publishedDate;
    private int likes;
    private int userId;
    private List<Comment> comments;
}
