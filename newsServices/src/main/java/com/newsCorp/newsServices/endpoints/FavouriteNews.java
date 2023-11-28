package com.newsCorp.newsServices.endpoints;


import com.newsCorp.newsServices.entity.News;
import com.newsCorp.newsServices.service.FavouriteNewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
@RequestMapping("/favNews")
public class FavouriteNews {

    @Autowired
    FavouriteNewsService favouriteNewsService;

    @PostMapping("/add/news")
    public ResponseEntity<News> addFavouriteNews(){
        return new ResponseEntity<>(new News(),HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/remove")
    public  ResponseEntity<News> deleteFavouriteNews(){
        return new ResponseEntity<News>(new News(),HttpStatus.ACCEPTED);
    }




}
