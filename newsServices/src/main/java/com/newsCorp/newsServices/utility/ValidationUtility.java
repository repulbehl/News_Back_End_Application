package com.newsCorp.newsServices.utility;

import com.newsCorp.newsServices.model.ExternalApiData;
import com.newsCorp.newsServices.model.FavouriteByUser;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class ValidationUtility {
    public String externalApiDataValidation(ExternalApiData externalApiData, String apiKey, String searchCriteria, String hitUrl){
        if(externalApiData ==  null){
           log.error(" External Api Response Coming is null", externalApiData);
           if(externalApiData.results == null){
               log.error(" External Api Dataset Coming is null", externalApiData.results);
               return null;
           }
           return null;
        }
        if(apiKey.isEmpty() && searchCriteria.isEmpty() && hitUrl.isEmpty() ){
            log.error(" Incoming feed contain Empty Value");
            log.info(" API Key is : ",apiKey);
            log.info(" Search Criteria is : ", searchCriteria);
            return null;
        }
        return  HttpStatus.OK.toString();
    }

    public String favouriteDataValidation(FavouriteByUser favouriteByUser){
        if(favouriteByUser != null){
            if(!favouriteByUser.title.isEmpty() && !favouriteByUser.content.isEmpty() && !favouriteByUser.category.isEmpty() && !favouriteByUser.imageUrl.isEmpty() && !favouriteByUser.language.isEmpty()){
                log.info("Validation Completed "+ favouriteByUser.toString());
                return  HttpStatus.OK.toString();
            }
        }
        log.error("Incoming Data is not valid ");
        return HttpStatus.NOT_FOUND.toString();
    }


}
