package com.newsCorp.newsServices.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Entity
@Data
@Table(name = "NEWS_CORP_NEWS")
public class News {

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
