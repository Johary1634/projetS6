package com.enchere.appli.repositories;

import com.enchere.appli.model.Image;
import com.enchere.appli.model.Pictures;
import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface PictureRepositories extends MongoRepository<Pictures, Integer>
{
    //All crud method database
    @Aggregation(pipeline = {
            "{'$match': {'idproduit':  ?0}}"
    })
    List<Pictures> findListById(int idproduit);
}