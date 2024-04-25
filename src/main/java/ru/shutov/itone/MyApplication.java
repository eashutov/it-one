package ru.shutov.itone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;

public class MyApplication {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("ru.shutov.itone");
        Map<String, Service> beans = context.getBeansOfType(Service.class);
        beans.forEach((name, bean) -> bean.print(name));
    }
}