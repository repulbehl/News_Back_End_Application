package com.newsCorp.newsServices.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.apache.logging.log4j.core.config.plugins.validation.constraints.NotBlank;

import java.util.Date;
import java.util.List;

@Entity
@Data
@Table(name = "NEWS_CORP_NEWS")
public class News {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    @NotBlank
    @Column(name = "NEWS_ID")
    private Long newsId;

    @Column(name = "TITLE")
    @NotBlank
    private String title;

    @Column(name = "CONTENT")
    @NotBlank
    private String content;

    @Column(name = "AUTHOR")
    private String author;

    @Column(name = "CATEGORY")
    @NotBlank
    private String category;

    @Column(name = "PUBLISH_DATE")
    private Date publishedDate;

    @Column(name = "DESCRIPTION")
    String fullDescription;

    @Column(name = "IMAGE_URL")
    @NotBlank
    String imageUrl;

    @Column(name = "LANGUAGE")
    @NotBlank
    String language;

    @Column(name = "LIKES")
    private int likes;

    @Column(name = "COMMENT_COUNT")
    private int numberOfComments;

    @OneToMany(targetEntity = Comment.class ,mappedBy = "news",cascade = CascadeType.ALL)
    private List<Comment> comments;

}
