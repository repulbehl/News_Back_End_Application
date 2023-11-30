package com.newsCorp.newsServices.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;


@Entity
@Data
@Table(name = "NEWS_CORP_NEWS_COMMENT")
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "COMMENT_ID")
    private Long commentId;

    @ManyToOne(targetEntity = News.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "newsId")
    private News news;

    @Column(name = "USER_ID")
    public int userId;
    @Column(name = "USERNAME")
    private String username;
    @Column(name = "CONTENT")
    private String content;
    @Column(name = "TIMESTAMP")
    private Date timestamp;

}