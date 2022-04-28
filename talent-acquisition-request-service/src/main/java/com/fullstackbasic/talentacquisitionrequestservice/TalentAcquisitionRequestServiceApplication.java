package com.fullstackbasic.talentacquisitionrequestservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class TalentAcquisitionRequestServiceApplication {

	@Value("${spring.application.name}")
	private String serviceName;

	@GetMapping("/test")
	public String getTest(){
		return "Test from the "+ serviceName;
	}

	public static void main(String[] args) {
		SpringApplication.run(TalentAcquisitionRequestServiceApplication.class, args);
	}

}
