package com.mcy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DataGeneratorServiceApplication {

  public static void main(String[] args) {
    ConfigurableApplicationContext ctx =
        SpringApplication.run(DataGeneratorServiceApplication.class, args);
    System.out.println("Bean count: " + ctx.getBeanDefinitionCount());
  }
}
