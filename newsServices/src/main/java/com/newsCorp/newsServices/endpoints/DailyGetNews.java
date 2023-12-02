package com.newsCorp.newsServices.endpoints;

import com.newsCorp.newsServices.model.DailyNews;
import com.newsCorp.newsServices.model.DailyNewsResponse;
import com.newsCorp.newsServices.service.FetchDailyNews;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DailyGetNews {
    @Autowired
    FetchDailyNews fetchDailyNews;
    @GetMapping("/newsBySearch")
    public ResponseEntity<List<DailyNews>> dailyNewsBySearch(@RequestParam("paramName") String paramName, @RequestHeader("api_key") String apiKey)
    {
        DailyNewsResponse dailyNews = fetchDailyNews.fetchNewsByCountry(apiKey,paramName);
        return new ResponseEntity<>(dailyNews.dailyNews, HttpStatus.OK);
    }
}