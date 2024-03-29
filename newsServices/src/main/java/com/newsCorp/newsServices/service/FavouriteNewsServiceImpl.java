package com.newsCorp.newsServices.service;

import com.newsCorp.newsServices.entity.News;
import com.newsCorp.newsServices.model.FavouriteByCategory;
import com.newsCorp.newsServices.model.FavouriteByUser;
import com.newsCorp.newsServices.repository.FavouriteNewsRepo;
import com.newsCorp.newsServices.utility.MapperUtility;
import com.newsCorp.newsServices.utility.ValidationUtility;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class FavouriteNewsServiceImpl implements FavouriteNewsService{

    @Autowired
    FavouriteNewsRepo favouriteNewsRepo;
    @Autowired
    MapperUtility mapperUtility;

    @Autowired
    ValidationUtility validationUtility;

    @Override
    public String  addFavNews(FavouriteByUser favouriteByUser) {
        String validationResponse = validationUtility.favouriteDataValidation(favouriteByUser);
        if(!validationResponse.equals(HttpStatus.NOT_FOUND.toString())){
            News news = mapperUtility.toNewsMapping(favouriteByUser);
            favouriteNewsRepo.save(news);
            log.info("Data Submitted "+favouriteByUser.toString());
            return HttpStatus.OK.toString();
        }
        return validationResponse;
    }

    @Override
    public  List<News>  getNewsByFavourites(FavouriteByCategory favouriteByCategory) {
        String validationResponse = validationUtility.favouriteCategoryValidation(favouriteByCategory);
        if(!validationResponse.equals(HttpStatus.NOT_FOUND.toString())) {
            return favouriteNewsRepo.findByCategory(favouriteByCategory.category,favouriteByCategory.userId);
        }
            return null;
    }

    @Override
    public String removeFavouriteNews(int id) {
        News  newsToBeRemoved = favouriteNewsRepo.getReferenceById(id);
        if (newsToBeRemoved == null ){
            return HttpStatus.NOT_FOUND.toString();
        }
        favouriteNewsRepo.delete(newsToBeRemoved);
        return HttpStatus.OK.toString();
    }


}
