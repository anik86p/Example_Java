package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Name {
    public String name;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}
