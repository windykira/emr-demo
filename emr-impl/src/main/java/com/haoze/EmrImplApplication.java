package com.haoze;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@ImportResource(value = {"classpath:dubbo-provider.xml"})
public class EmrImplApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmrImplApplication.class, args);
	}
}
