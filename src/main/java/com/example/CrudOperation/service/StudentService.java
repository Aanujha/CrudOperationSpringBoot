package com.example.CrudOperation.service;

import com.example.CrudOperation.dto.StudentDto;
import com.example.CrudOperation.model.Student;

import java.util.List;

public interface StudentService {

   StudentDto CreateStudent(StudentDto studentDto);

   void deleteStudent(Long id);

   StudentDto updateStudent(StudentDto studentDto ,Long id);

   List<Student> getAllStuden();


}
