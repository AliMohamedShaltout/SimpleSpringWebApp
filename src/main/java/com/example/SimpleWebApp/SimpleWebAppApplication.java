package com.example.SimpleWebApp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class SimpleWebAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleWebAppApplication.class, args);
	}
	@Bean
	public CommandLineRunner commandLineRunner (ApplicationContext ctx)
	{
		return args -> {
			System.out.println("BEANS");
			String[] beanNames= ctx.getBeanDefinitionNames();
			Arrays.sort(beanNames);

			for (String Bean:
				 beanNames) {
				System.out.println(Bean);
			}
		};
	}

}
