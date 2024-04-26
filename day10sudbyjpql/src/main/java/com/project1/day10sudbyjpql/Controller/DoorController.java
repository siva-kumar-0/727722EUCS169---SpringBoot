package com.project1.day10sudbyjpql.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project1.day10sudbyjpql.Model.Door1;
import com.project1.day10sudbyjpql.Service.DoorService;

@RestController
public class DoorController 
{
    @Autowired
    DoorService DS;

    @GetMapping("/api/door")
    public ResponseEntity<List<Door1>> getAll()
    {
        List<Door1> D=DS.getALLDatas();
        if(D!=null)
        return new ResponseEntity<>(D,HttpStatus.OK);
        else
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping("/api/door/{doorId}")
    public ResponseEntity<Door1> getById(@PathVariable int doorId)
    {
        Door1 D=DS.getById(doorId);
        if(D!=null)
        return new ResponseEntity<>(D,HttpStatus.OK);
        else
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    
    @GetMapping("/api/door/bydoorType")
    public ResponseEntity<List<Door1>> getByDoorType(@RequestParam String doorType)
    {
        List<Door1> D=DS.getByDoorType(doorType);
        if(D!=null)
        return new ResponseEntity<>(D,HttpStatus.OK);
        else
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    
    @GetMapping("/api/door/bycolor/{color}")
    public ResponseEntity<List<Door1>> getByColor(@PathVariable String color)
    {
        List<Door1> D=DS.getByColor(color);
        if(D!=null)
        return new ResponseEntity<>(D,HttpStatus.OK);
        else
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PostMapping("/api/door")
    public ResponseEntity<Door1> postdata(@RequestBody Door1 D)
    {
        Door1 D1=DS.postdata(D);
        if(D1!=null)
        return new ResponseEntity<>(D1,HttpStatus.CREATED);
        else
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
    
    @PutMapping("/api/door/{doorId}")
    public ResponseEntity<Door1> updateColorById(@PathVariable int doorId,@RequestParam String color)
    {
        Door1 D1=DS.UpdateColorById(doorId, color);
        if(D1!=null)
        return new ResponseEntity<>(D1,HttpStatus.CREATED);
        else
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/api/door/{doorId}")
    public ResponseEntity<String> deleteById(@PathVariable int doorId)
    {
        try{
            DS.DeleteById(doorId);
            return new ResponseEntity<>("Door deleted SuccessFully!",HttpStatus.OK);
        }
        catch(Exception e)
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    
}
