package com.docix.giflib.controller;

import com.docix.giflib.data.GifRepository;
import com.docix.giflib.model.Gif;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.util.List;

@Controller
public class GifController {

    //Added as an instance field
    //Autowired annotation tells Spring to construct and assign a gifRepo object to the instance field
    //as soon as it needed.
    //This is DI, or dependancy injection. We never called the gifRepository constructor. We let Spring do this.
    @Autowired
    private GifRepository gifRepository;

    @RequestMapping("/")
    public String listGifs(ModelMap modelMap){
        List<Gif> allGifs = gifRepository.getAllGifs();
        modelMap.put("gifs", allGifs);
        return "home";
    }

//    @RequestMapping("/gif")
//    public String gifDetails(ModelMap modelMap){
//        //Gif gif = new Gif("compiler-bot", LocalDate.of(2015,2,13), "scott", true);
//        Gif gif = gifRepository.findByName("android-explosion");
//        modelMap.put("gif", gif);
//        return "gif-details";
//    }



    //Now with 100% more path variables
    //example, http://localhost:8080/gifs/android-explosion
    @RequestMapping("/gif/{name}")
    public String gifDetails(@PathVariable String name, ModelMap modelMap){
        //Gif gif = new Gif("compiler-bot", LocalDate.of(2015,2,13), "scott", true);
        System.out.println("HERE: " + name);
        Gif gif = gifRepository.findByName(name);
        modelMap.put("gif", gif);
        return "gif-details";
    }
}
