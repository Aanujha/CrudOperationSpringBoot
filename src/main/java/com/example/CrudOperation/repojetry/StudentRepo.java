package com.example.CrudOperation.repojetry;

import com.example.CrudOperation.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,Long> {
}
