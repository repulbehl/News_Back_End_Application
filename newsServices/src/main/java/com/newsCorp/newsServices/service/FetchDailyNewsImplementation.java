package com.newsCorp.newsServices.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class FetchDailyNewsImplementation implements  FetchDailyNews{

    private String externalUrl="https://newsdata.io/api/1/news?apikey=";
    private String searchString= "&q=";

    @Override
    public String fetchNewsByCountry(String apiKey, String searchValue) {
        String fetchUrl= externalUrl+apiKey+searchString+searchValue;
         RestTemplate restTemplate = new RestTemplate();
        String response = restTemplate.getForObject(fetchUrl,String.class);
        return response;
    }
}
