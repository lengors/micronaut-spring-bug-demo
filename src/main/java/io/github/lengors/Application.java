package io.github.lengors;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.micronaut.runtime.Micronaut;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        Micronaut
            .build(args)
            .classes(Application.class)
            .eagerInitSingletons(true)
            .start();
    }
}