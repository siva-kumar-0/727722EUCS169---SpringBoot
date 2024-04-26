package com.project1.day12joinquery.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.project1.day12joinquery.Model.Student3;

@Repository
public interface StudnetRepo extends JpaRepository<Student3,Integer> 
{
    @Query("select S from Student3 S join S.studentDetail")
    List<Student3> InnerJoin();

    @Query("select S from Student3 S left outer join S.studentDetail s")
    List<Student3> LeftOuterJoin();
    
    Student3 findById(int id);

}
