package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {
 public int x;
 public int z;
 public int xx;
 public String dd;

	public static void main(String[] args)
	{
		ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		Name a=context.getBean(Name.class);
	}


}
