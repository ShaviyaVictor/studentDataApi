package com.example.demo.student;

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
            Student shaviya = new Student(
                    "Victor Shaviya",
                    "male",
                    "jamaica.shaviya@gmail.com",
                    550_3402,
                    LocalDate.of(1995, Month.AUGUST, 10)

            );
            Student jos = new Student(
                    "Josphine Mbaisi",
                    "female",
                    "jamaica.mbaisi@gmail.com",
                    293_0141,
                    LocalDate.of(1993, Month.SEPTEMBER, 2)

            );

            repository.saveAll(
                    List.of(shaviya, jos)
            );
        };
    }
}
