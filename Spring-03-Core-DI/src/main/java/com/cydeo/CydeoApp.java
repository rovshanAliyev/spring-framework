package com.cydeo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CydeoApp {
    public static void main(String[] args) {

        ApplicationContext container  = new AnnotationConfigApplicationContext(ConfigApp.class);

        Java jv = container.getBean(Java.class);
        jv.getTeachingHours();
    }
}
