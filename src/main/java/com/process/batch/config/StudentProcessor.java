package com.process.batch.config;

import com.process.batch.model.Student;
import org.springframework.batch.item.ItemProcessor;

public class StudentProcessor implements ItemProcessor<Student,Student> {

    @Override
    public Student process(Student student) {
        student.setId(null);
        return student;
    }
}