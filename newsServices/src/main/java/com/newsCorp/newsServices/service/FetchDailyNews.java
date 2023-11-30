package com.newsCorp.newsServices.service;

public interface FetchDailyNews {
    String fetchNewsByCountry(String apiKey,String searchValue);
}
