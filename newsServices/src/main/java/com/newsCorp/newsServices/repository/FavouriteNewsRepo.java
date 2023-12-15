package com.newsCorp.newsServices.repository;

import com.newsCorp.newsServices.entity.News;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FavouriteNewsRepo  extends JpaRepository<News,Integer> {

    @Query("SELECT b FROM NEWS_CORP_NEWS b WHERE b.category = :category AND b.userId = b.user_id")
    List<News> findByCategory(@Param("category") String category , @Param("userId") String userId);

}
