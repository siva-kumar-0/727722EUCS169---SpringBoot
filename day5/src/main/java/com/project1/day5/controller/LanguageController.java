package com.project1.day5.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project1.day5.model.Language;
import com.project1.day5.service.LanguageService;

@RestController
public class LanguageController 
{
    @Autowired
    LanguageService LS;

    @PostMapping("/language")
    public Language postdatas(@RequestBody Language L)
    {
        return LS.postdatas(L);
    }

    @PutMapping("/language/{languageId}")
    public Language updatedatas(@RequestBody Language L,@PathVariable int languageId)
    {
        return LS.postdatas(L);
    }

    @GetMapping("/language")
    public List<Language> getAll()
    {
        return LS.geAllLanguages();
    }

    @GetMapping("/language/{languageId}")
    public Optional<Language> getById(@PathVariable int languageId)
    {
        return LS.getById(languageId);
    }

    @DeleteMapping("/language/{languageId}")
    public void deleteById(@PathVariable int languageId)
    {
        LS.deleteById(languageId);
    }


}
