package com.DBFaker.DataFaker;

import com.DBFaker.DataFaker.DataFaker.DataFakerCreator;
import com.DBFaker.DataFaker.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DataFakerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DataFakerApplication.class, args);
	}

	@Autowired
	StudentRepository studentRepository;
	@Bean
	public CommandLineRunner commandLineRunner(String[] args) {
		return runner -> {
			DataFakerCreator.dataCreator(studentRepository);
		};
	}



}
