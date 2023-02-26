package ru.alekseev.kubertest.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = TestConfig.class)
class TestServiceTest {

    @Autowired
    TestService testService;

    @Autowired
    ServiceA serviceA;

    @Test
    void getStringFromService() {
        assertEquals("Fuck you", testService.getStringFromService(serviceA));
    }
}