package ru.shutov.itone;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {

    @Bean
    public Service serviceA() {
        return new ServiceA();
    }

    @Bean
    public Service serviceB(ServiceA serviceA) {
        return new ServiceB(serviceA);
    }
}
