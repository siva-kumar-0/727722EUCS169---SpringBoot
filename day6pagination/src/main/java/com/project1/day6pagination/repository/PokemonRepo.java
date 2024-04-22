package com.project1.day6pagination.repository;


import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
// import org.springframework.transaction.annotation.Transactional;

import com.project1.day6pagination.model.Pokemon;

@Repository
public interface PokemonRepo extends JpaRepository<Pokemon,Integer> 
{
    @Query(value = "select * from pokemon where hp=(select max(hp) from pokemon)",nativeQuery = true)
    Pokemon findByMaxHP();

    @Query(value = "select * from pokemon where hp=(select min(hp) from pokemon)",nativeQuery = true)
    Pokemon findByMinHP();

    @Query(value = "select * from pokemon where lower(name) =lower(:Name)",nativeQuery = true)
    Pokemon findByName(String Name);

    // @Modifying        Using While Modify the Data
    // @Transactional     
}
