package com.project1.day13swaggerui.Controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
public class SampleController 
{

    private static final Logger logger=LoggerFactory.getLogger(SampleController.class);

    @Tag(name = "Get Games" , description = "Its a Get API used To Fetch Games")
    @GetMapping("/api/GetGames")
    public List<String> getGames()
    {
        List<String> G=new ArrayList<String>();
        G.add("Clash Royal");
        G.add("Sekiro");
        logger.info("Games Fetched SuccessFully!");
        return G;
    }
    
    @Tag(name = "Get Books" , description = "Its a Get API used To Fetch Books")
    @GetMapping("/api/GetBooks")
    public List<String> getBooks()
    {
        List<String> B=new ArrayList<String>();
        B.add("திருக்குறள்");
        B.add("தொல்காப்பியம்");
        logger.info("Books Fetched SuccessFully!");
        return B;
    }
    
}
