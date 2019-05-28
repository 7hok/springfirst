package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    Human human;

    @Bean
    public Human human(){
        return  new Human();
    }

    @Bean
    public Person person() {
        return new Person("meme");
    }

    public String getter () {
        return human.toString();
    }
}

