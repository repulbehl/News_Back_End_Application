package com.newsCorp.newsServices.endpoints;


import com.newsCorp.newsServices.entity.News;
import com.newsCorp.newsServices.model.FavouriteByCategory;
import com.newsCorp.newsServices.model.FavouriteByUser;
import com.newsCorp.newsServices.service.FavouriteNewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/favNews")
public class FavouriteNews {

    @Autowired
    FavouriteNewsService favouriteNewsService;

    @PostMapping("/add/favNews")
    public ResponseEntity<String> addFavouriteNews(@RequestBody FavouriteByUser favouriteByUser){
        String response = favouriteNewsService.addFavNews(favouriteByUser);
        // write Logic for adding the news to FavouriteNewsRepo and business logic contains news
        return new ResponseEntity<>(response,HttpStatus.ACCEPTED);
    }

    public ResponseEntity<News> getFavouritesByUser(String name){
        // This will be set after the user module is created
    return null;
    }

    @GetMapping("/byCategory")
    public ResponseEntity<List<News>> getFavouritesByCategory(@RequestBody FavouriteByCategory category){
       List<News> news =  favouriteNewsService.getNewsByFavourites(category);
       // Add validation for the news is not empty
       return new ResponseEntity<>(news,HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/remove")
    public  ResponseEntity<News> deleteFavouriteNews(@RequestParam int id){
        return new ResponseEntity<News>(new News(),HttpStatus.ACCEPTED);
    }




}
