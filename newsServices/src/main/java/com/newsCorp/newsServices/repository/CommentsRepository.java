package com.newsCorp.newsServices.repository;

import com.newsCorp.newsServices.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentsRepository extends JpaRepository<Comment,Integer> {

}
