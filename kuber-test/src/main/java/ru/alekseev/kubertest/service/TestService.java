package ru.alekseev.kubertest.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
//@RequiredArgsConstructor
public class TestService {


    @PostConstruct
    void init(){
        System.out.println("Bean TestService was created");
    }

    public String getStringFromService(ServiceA serviceA){
        return serviceA.getFuck();
    }

}
