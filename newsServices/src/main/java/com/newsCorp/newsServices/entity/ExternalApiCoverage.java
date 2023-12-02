package com.newsCorp.newsServices.entity;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
@Table(name = "EXT_API_DATA_COVERAGE")
public class ExternalApiCoverage {

    @Id
    @GeneratedValue (strategy = GenerationType.SEQUENCE)
    @Column(name = "RESPONSE_ID")
    long responseId;
    @Column(name = "STATUS")
    String status;
    @Column(name = "RESULT_SET_COUNT")
    Long totalResultSet;
    @Column(name = "API_KEY")
    String apiKey;
    @Column(name = "SEARCH_CRITERIA")
    String searchCriteria;
    @Column(name = "URL")
    String hitUrl;
    @Column(name = "API_STATUS")
    String apiStatus;
    @Column(name = "TRANSFER_RESPONSE")
    String transferResponse;

    public ExternalApiCoverage(String status, Long totalResultSet, String apiKey, String searchCriteria, String hitUrl,  String apiStatus, String transferResponse) {
        this.status = status;
        this.totalResultSet = totalResultSet;
        this.apiKey = apiKey;
        this.searchCriteria = searchCriteria;
        this.hitUrl = hitUrl;
        this.apiStatus = apiStatus;
        this.transferResponse = transferResponse;
    }
}
