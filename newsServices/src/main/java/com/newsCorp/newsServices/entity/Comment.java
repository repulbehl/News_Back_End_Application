package com.newsCorp.newsServices.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table(name = "NEWS_CORP_NEWS_COMMENT")
public class Comment {

    private Long id;
    private String username;
    private String content;
    private Date timestamp;

}