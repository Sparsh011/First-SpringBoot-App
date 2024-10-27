package com.sparsh.FirstSpringBoot;

import com.sparsh.FirstSpringBoot.service.printers.ColorPrinter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstSpringBootApplication implements CommandLineRunner {
	@Autowired // we can use @Autowired annotation to initialize a bean rather than initializing it in App's constructor
	private ColorPrinter colorPrinter;

	public static void main(String[] args) {
		SpringApplication.run(FirstSpringBootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		colorPrinter.print();
	}
}
