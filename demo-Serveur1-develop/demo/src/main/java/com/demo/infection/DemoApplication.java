package com.demo.infection;


import com.demo.infection.model.HSQLDBserver1;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);
//		HSQLDBserver1 hdb = new HSQLDBserver1();
//		hdb.init();
	}

}
