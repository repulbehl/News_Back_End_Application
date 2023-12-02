package com.newsCorp.newsServices.service;

import com.newsCorp.newsServices.model.DailyNewsResponse;

public interface FetchDailyNews {
    DailyNewsResponse fetchNewsByCountry(String apiKey, String searchValue);
}
