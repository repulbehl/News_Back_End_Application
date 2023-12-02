package com.newsCorp.newsServices.service;

import com.newsCorp.newsServices.entity.ExternalApiCoverage;
import com.newsCorp.newsServices.model.ExternalApiData;

public interface ExternalApiService {
    public String addTriggeredResponse(ExternalApiData externalApiData,  String apiKey,String searchCriteria,String hitUrl);

}
