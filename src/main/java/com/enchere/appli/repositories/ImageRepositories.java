package com.enchere.appli.repositories;

import com.enchere.appli.model.Image;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ImageRepositories extends MongoRepository<Image, Integer>
{
    //All CRUD method database
}

