package ru.alekseev.kubertest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class ServiceA {

    @Autowired
    @Lazy
    private ServiceB serviceB;

    @PostConstruct
    void init(){
        System.out.println("Bean ServiceA was created");
    }

    public String getFuck(){
        return "Fuck you";
    }

}
