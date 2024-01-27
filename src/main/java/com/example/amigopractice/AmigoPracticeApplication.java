package com.example.amigopractice;

import com.example.amigopractice.Student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController
public class AmigoPracticeApplication {

    public static void main(String[] args) {

        SpringApplication.run(AmigoPracticeApplication.class, args);
    }


}
