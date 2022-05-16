package com.example.my_api.Student;

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
            Student mariam = new Student(
                    1L,
                    "Mariam",
                    "Mariam.brown@gmail.com",
                    LocalDate.of(1995, Month.FEBRUARY,10));

            Student alex = new Student(
                    2L,
                    "Alex",
                    "Alex.Smith@gmail.com",
                    LocalDate.of(1996, Month.MARCH,12));

            repository.saveAll(
                    List.of(mariam, alex)
            );
        };
    }
}
