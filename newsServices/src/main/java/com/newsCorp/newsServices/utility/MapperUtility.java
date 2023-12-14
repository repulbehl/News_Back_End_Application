package com.newsCorp.newsServices.utility;

import com.newsCorp.newsServices.entity.News;
import com.newsCorp.newsServices.model.FavouriteByUser;
import org.springframework.stereotype.Component;

@Component
public class MapperUtility {

    public News toNewsMapping(FavouriteByUser favouriteByUser){
        News news = new News();
        news.setTitle(favouriteByUser.title);
        news.setContent(favouriteByUser.content);
        news.setAuthor(favouriteByUser.author);
        news.setCategory(favouriteByUser.category.toString());
        news.setPublishedDate(favouriteByUser.publishedDate);
        news.setFullDescription(favouriteByUser.fullDescription);
        news.setImageUrl(favouriteByUser.imageUrl);
        news.setLanguage(favouriteByUser.language);
        news.setLikes(favouriteByUser.likes);
//        news.setNumberOfComments(favouriteByUser.comments.size());
        // also set the user details to the news
        news.setNumberOfComments(12);
        news.setComments(favouriteByUser.comments);
        return news;
    }

}
