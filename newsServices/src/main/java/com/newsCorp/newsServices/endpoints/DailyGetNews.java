package com.newsCorp.newsServices.endpoints;

import com.newsCorp.newsServices.model.newsMapper;
import com.newsCorp.newsServices.model.NewsResponse;
import com.newsCorp.newsServices.service.FetchDailyNews;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DailyGetNews {
    @Autowired
    FetchDailyNews fetchDailyNews;
    @GetMapping("/newsBySearch")
    public ResponseEntity<List<newsMapper>> newsBySearch(@RequestParam("paramName") String paramName, @RequestHeader("api_key") String apiKey)
    {
        NewsResponse dailyNews = fetchDailyNews.fetchNewsDaily(apiKey,paramName);
        return new ResponseEntity<>(dailyNews.dailyNews, HttpStatus.OK);
    }

}