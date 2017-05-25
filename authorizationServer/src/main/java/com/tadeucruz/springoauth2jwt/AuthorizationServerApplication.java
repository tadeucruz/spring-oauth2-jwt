package com.tadeucruz.springoauth2jwt;

import com.tadeucruz.springoauth2jwt.configuration.boot.CreateDefaultUserListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class AuthorizationServerApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(AuthorizationServerApplication.class, args);
		ctx.getBean(CreateDefaultUserListener.class);
	}
}
