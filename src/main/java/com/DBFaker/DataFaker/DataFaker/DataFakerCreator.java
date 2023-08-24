package com.DBFaker.DataFaker.DataFaker;

import com.DBFaker.DataFaker.Domain.Student;
import com.DBFaker.DataFaker.Repository.StudentRepository;
import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;

public class DataFakerCreator {
    @Autowired
    public static void dataCreator(StudentRepository studentRepository) {
        Faker faker = new Faker();
        for (int i = 0; i < 1000; i++) {
            String firstName = faker.name().firstName();
            String lastName = faker.name().lastName();
            String email = faker.internet().emailAddress();

            Student student = new Student(firstName, lastName, email);

            studentRepository.save(student);

        }
    }
}
