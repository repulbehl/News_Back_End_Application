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

    @PostMapping("/add/favNews")
    public ResponseEntity<String> addFavouriteNews(@RequestBody FavouriteByUser favouriteByUser){
        String response = favouriteNewsService.addFavNews(favouriteByUser);
        return new ResponseEntity<>(response,HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/remove")
    public  ResponseEntity<News> deleteFavouriteNews(@RequestParam int id){
        return new ResponseEntity<News>(new News(),HttpStatus.ACCEPTED);
    }




}
