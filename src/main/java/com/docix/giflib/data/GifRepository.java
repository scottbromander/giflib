package com.docix.giflib.data;

import com.docix.giflib.model.Gif;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

//This annotation allows this class to be picked up in the initial ComponentScan from another class.
//This happens in AppConfig Class
@Component
public class GifRepository {
    private static final List<Gif> ALL_GIFS = Arrays.asList(
        new Gif("android-explosion", LocalDate.of(2015,2,13), "Chris Ramacciotti", false),
        new Gif("ben-and-mike", LocalDate.of(2015,10,30), "Ben Jakuben", true),
        new Gif("book-dominos", LocalDate.of(2015,9,15), "Craig Dennis", false),
        new Gif("compiler-bot", LocalDate.of(2015,2,13), "Ada Lovelace", true),
        new Gif("cowboy-coder", LocalDate.of(2015,2,13), "Grace Hopper", false),
        new Gif("infinite-andrew", LocalDate.of(2015,8,23), "Marissa Mayer", true)
    );
    //Could just use the individual add as well.

    public Gif findByName(String name){
        for(Gif gif : ALL_GIFS){
            if(gif.getName().equals(name)){
                return gif;
            }
        }
        return null;
    }

    public List<Gif> getAllGifs(){
        return ALL_GIFS;
    }
}
