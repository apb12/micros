package ru.alekseev.kubertest.service;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class ServiceB {

    @PostConstruct
    void init(){
        System.out.println("Bean ServiceB was created");
    }

}
