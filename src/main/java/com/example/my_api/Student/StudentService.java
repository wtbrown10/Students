package com.example.my_api.Student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudents(){
        return List.of(
                new Student(
                        1L,
                        "Mariam",
                        "Mariam.brown@gmail.com",
                        LocalDate.of(1995, Month.FEBRUARY,10),
                        25)
        );
    }
}
