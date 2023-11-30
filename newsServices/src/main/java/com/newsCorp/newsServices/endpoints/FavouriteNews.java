package com.newsCorp.newsServices.endpoints;


import com.newsCorp.newsServices.entity.News;
import com.newsCorp.newsServices.model.FavouriteByUser;
import com.newsCorp.newsServices.service.FavouriteNewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/favNews")
public class FavouriteNews {

    @Autowired
    FavouriteNewsService favouriteNewsService;

    @PostMapping("/add/news")
    public ResponseEntity<News> addFavouriteNews(@RequestBody FavouriteByUser favouriteByUser){
        // write Logic for adding the news to FavouriteNewsRepo and business logic contains news
        return new ResponseEntity<>(new News(),HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/remove")
    public  ResponseEntity<News> deleteFavouriteNews(@RequestParam int id){
        return new ResponseEntity<News>(new News(),HttpStatus.ACCEPTED);
    }




}
