package com.newsCorp.newsServices.model;

import java.util.List;

public class NewsResponse {
    public List<newsMapper> dailyNews;
    public String status;

    public NewsResponse(List<newsMapper> dailyNews, String status){
        this.dailyNews = dailyNews;
        this.status =status;
    }
}
