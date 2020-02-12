package com.example.neo4j.com.example.neo4j;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;

@SpringBootApplication
//@EnableNeo4jRepositories("movies.spring.data.neo4j.repositories")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
