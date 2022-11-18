package com.example.demo.Student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student angelo = new Student("Matiam", "Matian@gmail.com", LocalDate.of(2000, Month.JANUARY, 5));
            Student ja = new Student("Ja", "ja@gmail.com", LocalDate.of(2011, Month.JANUARY, 5));

            repository.saveAll(List.of(angelo, ja));
        };
    };
}
