package com.stock.VestLab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class VestLabApplication {

	public static void main(String[] args) {
		SpringApplication.run(VestLabApplication.class, args);
	}

}
