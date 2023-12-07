package com.newsCorp.newsServices.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class newsMapper {
    @JsonProperty("title")
    String title;
    @JsonProperty("link")
    String link;
    @JsonProperty("keywords")
    List<String> keywords;
    @JsonProperty("creator")
    List<String> creator;
    @JsonProperty("video_url")
    String videoUrl;
    @JsonProperty("description")
    String description;
    @JsonProperty("content")
    String content;
    @JsonProperty("pubDate")
    String pubDate;
    @JsonProperty("full_description")
    String fullDescription;
    @JsonProperty("image_url")
    String imageUrl;
    @JsonProperty("source_id")
    String source_id;
    @JsonProperty("country")
    List<String> country;
    @JsonProperty("category")
    List<String> category;
    @JsonProperty("language")
    String language;
}
