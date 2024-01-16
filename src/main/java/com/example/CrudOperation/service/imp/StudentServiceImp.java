package com.example.CrudOperation.service.imp;

import com.example.CrudOperation.dto.StudentDto;
import com.example.CrudOperation.model.Student;
import com.example.CrudOperation.repojetry.StudentRepo;
import com.example.CrudOperation.service.StudentService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImp  implements StudentService {

    @Autowired
    private StudentRepo studentRepo;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public StudentDto CreateStudent(StudentDto studentDto) {
       Student student =  modelMapper.map(studentDto ,Student.class);
       studentRepo.save(student);
        return studentDto;
    }

    @Override
    public void deleteStudent(Long id) {
    studentRepo.deleteById(id);
    }

    @Override
    public StudentDto updateStudent(StudentDto studentDto) {
       Student student = modelMapper.map(studentDto ,Student.class);
       studentRepo.save(student);
       return studentDto;
    }


    @Override
    public List<Student> getAllStuden() {
      return studentRepo.findAll();

    }

    @Override
    public List<Student> read() {
        return studentRepo.findAll();
    }


}
