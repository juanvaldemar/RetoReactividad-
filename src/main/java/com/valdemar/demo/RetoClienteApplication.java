package com.valdemar.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;

@SpringBootApplication
public class RetoClienteApplication implements CommandLineRunner{


	@Autowired
	private ReactiveMongoTemplate mongoTemplate;
	private static final Logger log = LoggerFactory.getLogger(RetoClienteApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(RetoClienteApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println("Hola Cliente Valdemar!!!!");
	}

}