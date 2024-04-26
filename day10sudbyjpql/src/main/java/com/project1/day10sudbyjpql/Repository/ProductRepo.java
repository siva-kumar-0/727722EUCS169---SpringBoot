package com.project1.day10sudbyjpql.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.project1.day10sudbyjpql.Model.Product1;

import jakarta.transaction.Transactional;

@Repository
public interface ProductRepo extends JpaRepository<Product1,Integer> 
{
    @Query("Select P from Product1 P where P.category = :cat")
    List<Product1> getByCategory(String cat);

    @Modifying
    @Transactional
    @Query("update Product1 P set P.quantityInStock = :qis where P.productId = :id")
    void updateQuantity(int id,int qis);

    @Query("Select P from Product1 P where P.productId = :id")
    Product1 getById(int id);

}
