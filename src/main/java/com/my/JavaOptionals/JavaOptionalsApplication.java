package com.my.JavaOptionals;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Optional;

@SpringBootApplication
public class JavaOptionalsApplication {

	public static void main(String[] args) {

		SpringApplication.run(JavaOptionalsApplication.class, args);

		Optional<Object> empty = Optional.empty();

		System.out.println(empty);

	}

}
