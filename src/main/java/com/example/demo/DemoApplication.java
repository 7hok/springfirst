package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
// import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DemoApplication {
   


    public static void main(String[] args) {
         ApplicationContext context =  SpringApplication.run(DemoApplication.class, args);
        // ClassPathXmlApplicationContext contexter = new ClassPathXmlApplicationContext("applicationContext.xml");
        // Person person =(Person) contexter.getBean("person");
        // person.say();
        // Human human = context.getBean(Human.class)
        // System.out.println(human);

    }

}
