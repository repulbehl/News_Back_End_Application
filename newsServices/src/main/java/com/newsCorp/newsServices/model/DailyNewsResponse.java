package com.newsCorp.newsServices.model;

import java.util.List;

public class DailyNewsResponse {
    public List<DailyNews> dailyNews;
    public String status;

    public DailyNewsResponse(List<DailyNews> dailyNews, String status){
        this.dailyNews = dailyNews;
        this.status =status;
    }
}
