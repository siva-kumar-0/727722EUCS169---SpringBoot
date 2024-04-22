package com.project1.day6pagination.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.project1.day6pagination.model.Language;
import com.project1.day6pagination.repository.LanguageRepo;

@Service
public class LanguageService 
{
    @Autowired
    LanguageRepo LR;

    public List<Language> getBySorting(String S)
    {
        return LR.findAll(Sort.by(S).ascending());
    }

    public Page<Language> getAsPage(int os,int ps)
    {
        return LR.findAll(PageRequest.of(os, ps));
    }

    public Page<Language> getAsPageWithSort(int os,int ps,String S)
    {
        return LR.findAll(PageRequest.of(os, ps,Sort.by(S).ascending()));
    }

    public Language postdata(Language L)
    {
        return LR.save(L);
    }
}
