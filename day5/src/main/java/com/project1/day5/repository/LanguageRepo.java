package com.project1.day5.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project1.day5.model.Language;

@Repository
public interface LanguageRepo extends JpaRepository<Language,Integer> {

}
