package com.weklyTest.Test.service;

import com.weklyTest.Test.entity.Resturent;
import com.weklyTest.Test.repo.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Service {
    @Autowired
    Repo mylist;
    public String postmap(Resturent newresturent) {
        mylist.getMyResturent().add(newresturent);
        return " resturent added!";
    }

    public List<Resturent> allResturent() {
        return mylist.getMyResturent();
    }

    public Resturent getResturentById(Integer id) {
        for(Resturent r:mylist.getMyResturent())
        {
            if(r.getResturentId().equals(id))
            {   System.out.println("Sucssefull gut it !");
                return r;
            }
        }
        System.out.println("plese geve vailid id !");
        return new Resturent(1,"xy","kol",0,0);
    }

    public String update(Integer id, String add) {
        for(Resturent r:mylist.getMyResturent()){
            if(r.getResturentId().equals(id))
            {
                r.setResturentAddress(add);
                return "sucess fully updated!";
            }
        }
        return "plese give vailid id!";
    }

    public String del(Integer id) {
        for(Resturent r:mylist.getMyResturent()){
            if(r.getResturentId().equals(id))
            {
                mylist.getMyResturent().remove(r);
                return "sucess fully deleted!";
            }
        }
        return " not deleted plese give vailid id !";
    }
}
