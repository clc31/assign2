package com.assign2.students.Models;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer>{
    List<Student> findByName(String name);
    List<Student> findByHeight(Integer height);
    Student findByUid(int uid);
}
