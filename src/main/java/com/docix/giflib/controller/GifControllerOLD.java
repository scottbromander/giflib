//package com.docix.giflib.controller;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//@Controller
//public class GifControllerOLD {
//
//    //Request Mapping helps with URI, needs elements, in parans
//    //Note that you could use value like listed below, but it is the only time we will use value,
//    //So we can omit, like below.
//    //@RequestMapping(value = "/")
//    //1.
////    @RequestMapping("/")
////    @ResponseBody
////    public String listGifs(){
////        return "List of all the GIFs";
////    }
//    //2.
//    @RequestMapping("/")
//    public String listGifs(){
//        //Note that Thyme lead does not want the ResponseBody, so we drop that annotation,
//        //Thymeleaf just needs the file name (without the file extension) returned as a String.
//        return "home";
//    }
//
//    @RequestMapping("/gif")
//    @ResponseBody
//    public String justOneGif(){
//        return "Here is a gif!";
//    }
//}
