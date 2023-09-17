package com.weklyTest.Test.controller;

import com.weklyTest.Test.entity.Resturent;
import com.weklyTest.Test.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controler {
    @Autowired
    Service myService;
    // post maping
    @PostMapping("Resturent")
    public String postmap(@RequestBody Resturent newresturent)
    {
         return myService.postmap(newresturent);
    }
    //get maping
    @GetMapping("Resturents")
    public List<Resturent> allResturent()
    {
        return myService.allResturent();
    }
    // get resturent by id
    @GetMapping("Resturent/{id}/id")
    public Resturent getResturentById(@PathVariable Integer id)
    {
        return myService.getResturentById( id);
    }
    //update put maping
    @PutMapping("Resturent/update/id/{id}/address/{add}/api")
    public String update(@PathVariable Integer id,@PathVariable String add)
    {
        return myService.update(id,add);
    }
    // delete
    @DeleteMapping("Resturent/{id}/Delete")
    public String del(@PathVariable Integer id)
    {
        return myService.del(id);
    }

}
