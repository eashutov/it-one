package ru.shutov.itone;

import org.springframework.beans.factory.annotation.Autowired;

public class ServiceB implements Service {
    private final ServiceA serviceA;

    @Autowired
    public ServiceB(ServiceA serviceA) {
        this.serviceA = serviceA;
    }

    @Override
    public void print(String message) {
        System.out.println("from ServiceB");
        serviceA.print(message);
        System.out.println("ServiceB: " + message);
    }
}
