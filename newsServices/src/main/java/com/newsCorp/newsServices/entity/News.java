package com.newsCorp.newsServices.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Entity
@Data
@Table(name = "NEWS_CORP_NEWS")
public class News {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    @Column(name = "NEWS_ID")
    private Long newsId;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "CONTENT")
    private String content;

    @Column(name = "AUTHOR")
    private String author;

    @Column(name = "CATEGORY")
    private String category;

    @Column(name = "PUBLISH_DATE")
    private Date publishedDate;

    @Column(name = "LIKES")
    private int likes;

    @Column(name = "COMMENT_COUNT")
    private int numberOfComments;

    @OneToMany(targetEntity = Comment.class ,mappedBy = "news",cascade = CascadeType.ALL)
    private List<Comment> comments;

}
