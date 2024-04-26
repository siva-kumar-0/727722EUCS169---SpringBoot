package com.project1.day10sudbyjpql.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.project1.day10sudbyjpql.Model.Door1;

import jakarta.transaction.Transactional;

@Repository
public interface DoorRepo extends JpaRepository<Door1,Integer>
{

    @Query("select D from Door1 D where D.color= :color")
    List<Door1> getByColor(String color);

    @Modifying
    @Transactional
    @Query("update Door1 D set D.color = :color where D.doorId= :id")
    int UpdateColorById(String color,int id);


    // @Modifying
    // @Transactional
    // @Query("delete from Door1 D where D.doorId = :id")
    // void DeleteById(int id);

    @Query("select D from Door1 D where D.doorType= :dt")
    List<Door1> geyByDoorType(String dt);

    @Query("select D from Door1 D")
    List<Door1> getAllDatas();

    @Query("select D from Door1 D where D.doorId= :id")
    Door1 getById(int id);
    
}
