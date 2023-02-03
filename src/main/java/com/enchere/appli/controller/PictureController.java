package com.enchere.appli.controller;


import com.enchere.appli.exception.ResourceNotFoundException;
import com.enchere.appli.model.Image;
import com.enchere.appli.model.ObjectReturn;
import com.enchere.appli.model.Pictures;
import com.enchere.appli.repositories.ImageRepositories;
import com.enchere.appli.repositories.PictureRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin
@RestController
@RequestMapping("pictures")
public class PictureController
{
    @Autowired
    PictureRepositories pictureRepositories;

    @PostMapping
    public ObjectReturn newImage(@RequestBody Pictures[] pictures)
    {
        ObjectReturn objet = null;
        try
        {
            objet = new ObjectReturn();
            for(int i=0;i<pictures.length;i++) {
                pictureRepositories.save(pictures[i]);
            }
            objet.setMessage("Success");
        }
        catch (Exception e)
        {
            throw e;
        }
        return objet;
    }

    @GetMapping
    public ObjectReturn getImage() throws Exception
    {
        ObjectReturn objet = null;
        try
        {
            objet = new ObjectReturn();
            List<Pictures> picture = pictureRepositories.findAll();
            objet.setData(picture);
            objet.setMessage("Success");
        }
        catch (Exception e)
        {
            throw e;
        }
        return objet;
    }

    @GetMapping("{id}")
    public List<Pictures> getPictureById(@PathVariable int id)
    {
        return pictureRepositories.findListById(id);
    }
}
