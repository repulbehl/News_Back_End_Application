package com.newsCorp.newsServices.repository;

import com.newsCorp.newsServices.entity.News;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FavouriteNewsRepo  extends JpaRepository<News,Integer> {

}
