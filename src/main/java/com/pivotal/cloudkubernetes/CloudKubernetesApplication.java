package com.pivotal.cloudkubernetes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@EnableDiscoveryClient
@EnableScheduling
@RestController
public class CloudKubernetesApplication {

	@Autowired
	private DiscoveryClient discoveryClient;

	public static void main(String[] args) {
		SpringApplication.run(CloudKubernetesApplication.class, args);
	}


	@RequestMapping("/")
	public String hello() {
		return "Hello World";
	}

	@RequestMapping("/services")
	public List<String> services() {

		return this.discoveryClient.getServices();
	}

}
