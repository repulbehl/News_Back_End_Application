package com.newsCorp.newsServices.service;

import com.newsCorp.newsServices.model.NewsResponse;

public interface FetchDailyNews {
    NewsResponse fetchNewsDaily(String apiKey, String searchValue);

}
