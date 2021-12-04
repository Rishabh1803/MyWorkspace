package com.rk.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com")
@EnableJpaRepositories(basePackages = "com.dsc.persistance")
@EntityScan(basePackages = "com.dsc.bean")
public class ProjectDscApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectDscApplication.class, args);
	}

}
