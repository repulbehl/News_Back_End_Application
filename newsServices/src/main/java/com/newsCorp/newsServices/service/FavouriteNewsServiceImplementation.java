package com.newsCorp.newsServices.service;

import com.newsCorp.newsServices.repository.FavouriteNewsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FavouriteNewsServiceImplementation {

    @Autowired
    FavouriteNewsRepo favouriteNewsRepo;


}