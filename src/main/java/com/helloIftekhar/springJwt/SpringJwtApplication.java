package com.helloIftekhar.springJwt;

import com.helloIftekhar.springJwt.model.Employee;
import com.helloIftekhar.springJwt.repository.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;
import java.time.Instant;

@SpringBootApplication
public class SpringJwtApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJwtApplication.class, args);
	}


	@Bean
	public CommandLineRunner commandLineRunner(EmployeeRepository repository){
		return args->{
			repository.deleteAll();
			for (int i=1;i<=7;i++){
				repository.save(new Employee(null,"employee n°"+i, BigDecimal.valueOf(1526*i), Instant.now()));
			}
		};
	}

}
