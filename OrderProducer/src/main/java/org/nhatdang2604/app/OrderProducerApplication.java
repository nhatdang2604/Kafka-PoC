package org.nhatdang2604.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="org.nhatdang2604")
public class OrderProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderProducerApplication.class, args);
	}

}
