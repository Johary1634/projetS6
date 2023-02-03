package com.enchere.appli.controller;

import com.enchere.appli.model.Image;
import com.enchere.appli.model.ObjectReturn;
import com.enchere.appli.repositories.ImageRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("images")
public class ImageController
{
    @Autowired
    ImageRepositories imageRepositories;

    @PostMapping
    public ObjectReturn newImage(@RequestBody Image image)
    {
        ObjectReturn objet = null;
        try
        {
            objet = new ObjectReturn();
            imageRepositories.save(image);
            objet.setMessage("Success");
        }
        catch (Exception e)
        {
            throw e;
        }
        return objet;
    }

    @GetMapping
    public ObjectReturn getImage()
    {
        ObjectReturn objet = null;
        try
        {
            objet = new ObjectReturn();
            List<Image> image = imageRepositories.findAll();
            objet.setData(image);
            objet.setMessage("Success");
        }
        catch (Exception e)
        {
            throw e;
        }
        return objet;
    }
}
