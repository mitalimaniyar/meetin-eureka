package org.jeavio.meetin.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MeetinEureakaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MeetinEureakaApplication.class, args);
	}

}
