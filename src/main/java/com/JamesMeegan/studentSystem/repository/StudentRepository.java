package com.JamesMeegan.studentSystem.repository;

import com.JamesMeegan.studentSystem.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository  extends JpaRepository<Student,Integer>{
}
