package com.weklyTest.Test.dataSource;

import com.weklyTest.Test.entity.Resturent;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class Mydata {
    @Bean
    public List<Resturent> listofResturent()
    {
        return new ArrayList<>();
    }

}
