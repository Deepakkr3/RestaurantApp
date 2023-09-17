package com.weklyTest.Test.repo;

import com.weklyTest.Test.entity.Resturent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class Repo {
    @Autowired
    List<Resturent> myResturent;
    public List<Resturent> getMyResturent()
    {
        return myResturent;
    }

}
