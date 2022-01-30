package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.JANUARY;


@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student miguel = new Student(
                    "Miguel",
                    "miguel@canessa.com",
                    LocalDate.of(2000, JANUARY, 5)
            );

            Student alex = new Student(
                    2L,
                    "Alex",
                    "alex@canessa.com",
                    LocalDate.of(2004, JANUARY, 15)
            );

            repository.saveAll(
                    List.of(miguel, alex)
            );
        };
    }
}
