package com.project1.day10sudbyjpql.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project1.day10sudbyjpql.Model.Door1;
import com.project1.day10sudbyjpql.Repository.DoorRepo;

@Service
public class DoorService 
{
    @Autowired
    DoorRepo DR;

    public Door1 postdata(Door1 D)
    {
        return DR.save(D);
    }

    public List<Door1> getByColor(String color)
    {
        return DR.getByColor(color);
    }

    public Door1 UpdateColorById(int id,String color)
    {
        DR.UpdateColorById(color, id);
        return DR.getById(id);
    }

    public void DeleteById(int id)
    {
        DR.deleteById(id);
    }

    public List<Door1> getByDoorType(String dt)
    {
        return DR.geyByDoorType(dt);
    }

    public List<Door1> getALLDatas()
    {
        return DR.getAllDatas();
    }

    public Door1 getById(int id)
    {
        return DR.getById(id);
    }
}
