package com.project1.day12joinquery.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project1.day12joinquery.Model.Address;
import com.project1.day12joinquery.Model.Employee1;
import com.project1.day12joinquery.Repository.AddressRepo;

@Service
public class AddressService 
{
    @Autowired
    AddressRepo AR;

    @Autowired
    EmployeeService ES;

    public Address updateAddress(Address A,int id)
    {
        Employee1 E=ES.getById(id);
        E.setAddress(A);
        ES.postdata(E);
        return E.getAddress();
    }

}
