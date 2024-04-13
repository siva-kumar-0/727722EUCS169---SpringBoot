package com.project1.day5.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project1.day5.model.Language;
import com.project1.day5.repository.LanguageRepo;

@Service
public class LanguageService 
{
    @Autowired
    LanguageRepo LR;

    public Language postdatas(Language L)
    {
        return LR.save(L);
    }

    public Language updatedatas(Language L)
    {
        return LR.save(L);
    }

    public void deleteById(int id)
    {
        LR.deleteById(id);
    }

    public List<Language> geAllLanguages()
    {
        return LR.findAll();
    }

    public Optional<Language> getById(int id)
    {
        return LR.findById(id);
    }
}
