package com.app.sfgdi.controllers;

import com.app.sfgdi.services.ConstructorGreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectedControllerTest {

    ConstructorInjectedController constructorInjectedController;
    @BeforeEach
    void setUp() {
        constructorInjectedController = new ConstructorInjectedController(new ConstructorGreetingServiceImpl());
    }

    @Test
    void getGreetings() {
        System.out.println(constructorInjectedController.getGreetings());;
    }
}