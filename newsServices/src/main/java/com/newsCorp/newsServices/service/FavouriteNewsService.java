package com.newsCorp.newsServices.service;

import com.newsCorp.newsServices.entity.News;
import com.newsCorp.newsServices.model.FavouriteByCategory;
import com.newsCorp.newsServices.model.FavouriteByUser;

import java.util.List;

public interface FavouriteNewsService {

    String addFavNews(FavouriteByUser favouriteByUser);

    List<News> getNewsByFavourites(FavouriteByCategory favouriteByCategory);

    String removeFavouriteNews(int id );

}
