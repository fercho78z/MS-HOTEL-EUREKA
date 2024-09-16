package com.msvc.hotel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MicroServicioHotelApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroServicioHotelApplication.class, args);
	}

}
