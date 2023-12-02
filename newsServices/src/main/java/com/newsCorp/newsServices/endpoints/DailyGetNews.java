package com.newsCorp.newsServices.endpoints;

import com.newsCorp.newsServices.service.FetchDailyNews;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class DailyGetNews {
    @Autowired
    FetchDailyNews fetchDailyNews;
    @GetMapping("/example")
    public void dailyNews(@RequestParam("paramName") String paramName,@RequestHeader("api_key") String apiKey)
    {
        fetchDailyNews.fetchNewsByCountry(apiKey,paramName);
        System.out.println("right");
    }
}
