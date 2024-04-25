package ru.shutov.itone;

public class ServiceA implements Service {

    @Override
    public void print(String message) {
        System.out.println("ServiceA: " + message);
    }
}
