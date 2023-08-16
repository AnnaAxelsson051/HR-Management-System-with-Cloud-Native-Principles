package net.javamicro.employeeservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class EmployeeServiceApplication {

	//Configure webclient as a spring bean

	@Bean
	public WebClient webClient(){
		return WebClient.builder().build();
	}


	public static void main(String[] args) {
		SpringApplication.run(EmployeeServiceApplication.class, args);
	}

}
