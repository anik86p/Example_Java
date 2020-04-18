package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Name {
    public String name;
    public int branch1;
    public int getBranch2;
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}
