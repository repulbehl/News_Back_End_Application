package com.newsCorp.newsServices.service;

import com.newsCorp.newsServices.entity.ExternalApiCoverage;
import com.newsCorp.newsServices.model.ExternalApiData;
import com.newsCorp.newsServices.repository.ExternalApiRepo;
import com.newsCorp.newsServices.utility.ValidationUtility;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ExternalApiServiceImpl implements ExternalApiService{

    @Autowired
    ExternalApiRepo externalApiRepo;

    @Autowired
    ValidationUtility validationUtility;

    @Override
    public String addTriggeredResponse(ExternalApiData externalApiData, String apiKey, String searchCriteria, String hitUrl) {
        String transferResponse;
        String validationStatus = validationUtility.externalApiDataValidation(externalApiData,apiKey,searchCriteria,hitUrl);
        if(!validationStatus.isEmpty()){
            transferResponse= HttpStatus.OK.toString();
            ExternalApiCoverage externalApiCoverage = new ExternalApiCoverage(externalApiData.status, externalApiData.totalResults, apiKey,searchCriteria,hitUrl,validationStatus,transferResponse);
            externalApiRepo.save(externalApiCoverage);
            log.info("DATA IS COMPLETED");
            return HttpStatus.OK.toString();
        }
        log.error("Validation failed ");
        return HttpStatus.NOT_FOUND.toString();
    }
}
