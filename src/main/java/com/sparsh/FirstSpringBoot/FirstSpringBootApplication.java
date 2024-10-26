package com.sparsh.FirstSpringBoot;

import com.sparsh.FirstSpringBoot.service.ColorPrinter;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstSpringBootApplication implements CommandLineRunner {
	private ColorPrinter colorPrinter;

	public FirstSpringBootApplication(ColorPrinter colorPrinter) {
		this.colorPrinter = colorPrinter;
	}

	public static void main(String[] args) {
		SpringApplication.run(FirstSpringBootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		colorPrinter.print();
	}
}
