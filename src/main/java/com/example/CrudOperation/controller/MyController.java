package com.example.CrudOperation.controller;

import com.example.CrudOperation.dto.StudentDto;
import com.example.CrudOperation.model.Student;
import com.example.CrudOperation.service.StudentService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

 @RestController
 @RequestMapping("/student")
public class MyController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/create")
    public ResponseEntity<?>CreateStudent(@RequestBody StudentDto studentDto){
        StudentDto studentDto1 = studentService.CreateStudent(studentDto);
        return new ResponseEntity<>(studentDto1, HttpStatus.OK);
    }

    @GetMapping("/getAll")
    public ResponseEntity<?>getAllStudent(){
        List<Student> studentList = studentService.getAllStuden();
        return new ResponseEntity<>(studentList,HttpStatus.OK);
    }

    @DeleteMapping("delet/{id}")
    public ResponseEntity<?>deleteStudent(@PathVariable("id")Long id ){
        studentService.deleteStudent(id);
        Map<String ,String> stringMap = new HashMap<>();
        stringMap.put( "Message", "Student Delete Successfully");
        return new ResponseEntity<>(stringMap ,HttpStatus.OK);

    }

    @PutMapping("update")
    public ResponseEntity<?>updateStudent(@RequestBody StudentDto studentDto){
    studentService.updateStudent(studentDto);
    Map<String, String> stringMap = new HashMap<>();
    stringMap.put("Message","Student Update Successful");
    return new ResponseEntity<>(stringMap,HttpStatus.OK);
    }

     @GetMapping("/read/{id}")
     public ResponseEntity<?> read(@PathVariable("id") Long id) {
        studentService.read();
        Map<String, String> map = new HashMap<>();
        map.put("Message","Read Only The Student Details");
         return new ResponseEntity<>(map,HttpStatus.OK);
     }
}
