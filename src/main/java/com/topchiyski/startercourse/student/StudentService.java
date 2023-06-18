package com.topchiyski.startercourse.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {

    public List<Student> findAllStudents() {
        return List.of(
                new Student(
                        "Bozhidar",
                        "Topchiyski",
                        LocalDate.now(),
                        "topchiyski@gmail.com",
                        27
                ),
                new Student(
                        "Ivan",
                        "Ivanov",
                        LocalDate.now(),
                        "topchiyski@gmail.com",
                        23
                )
        );
    }

}
