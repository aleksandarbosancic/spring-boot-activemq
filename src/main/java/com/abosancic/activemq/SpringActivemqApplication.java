package com.abosancic.activemq;

import com.google.gson.Gson;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class SpringActivemqApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringActivemqApplication.class, args);
	}
    
    @Bean
    public Gson gson() {
        return new Gson();
    }
    
}
