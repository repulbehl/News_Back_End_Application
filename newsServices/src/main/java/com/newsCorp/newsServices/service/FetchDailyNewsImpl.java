package com.newsCorp.newsServices.service;

import com.newsCorp.newsServices.model.DailyNews;
import com.newsCorp.newsServices.model.ExternalApiData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class FetchDailyNewsImpl implements  FetchDailyNews{

    private String externalUrl="https://newsdata.io/api/1/news?apikey=";
    private String searchString= "&q=";

    @Autowired
    ExternalApiService externalApiService;

    @Override
    public String fetchNewsByCountry(String apiKey, String searchValue) {
        String fetchUrl= externalUrl+apiKey+searchString+searchValue;
        RestTemplate restTemplate = new RestTemplate();
        ExternalApiData response = restTemplate.getForObject(fetchUrl,ExternalApiData.class);
        externalApiService.addTriggeredResponse(response,apiKey,searchValue,fetchUrl);
        return HttpStatus.OK.toString();
    }
}
