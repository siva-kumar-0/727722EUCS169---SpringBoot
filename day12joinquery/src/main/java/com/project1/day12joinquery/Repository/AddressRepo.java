package com.project1.day12joinquery.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project1.day12joinquery.Model.Address;

@Repository
public interface AddressRepo extends JpaRepository<Address,Integer> {

}
