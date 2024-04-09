package br.com.sistema.loadbalancerserver;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class LoadbalancerServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoadbalancerServerApplication.class, args);
	}


	@Value("${server.instance.id}")
	String instanceId;

	@GetMapping("/hello")
	public String hello()
	{
		return String.format("Hello from instance %s", instanceId);
	}
}
