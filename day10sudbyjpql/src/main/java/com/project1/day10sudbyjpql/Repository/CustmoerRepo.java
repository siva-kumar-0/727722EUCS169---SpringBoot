package com.project1.day10sudbyjpql.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.project1.day10sudbyjpql.Model.Customer1;

import jakarta.transaction.Transactional;

@Repository
public interface CustmoerRepo extends JpaRepository<Customer1,Integer> 
{
    @Query("select c from Customer1 c where c.city = :city")
    List<Customer1> getByCity(String city);

    @Query("select c from Customer1 c where c.customerId = :id")
    Customer1 getById(int id);

    @Modifying
    @Transactional
    @Query("update Customer1 c set c.pincode = :pc where c.customerId = :id")
    void SetPincode(int pc,int id);

}
