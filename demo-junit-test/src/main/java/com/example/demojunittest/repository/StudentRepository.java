package com.example.demojunittest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demojunittest.Entity.StudentEntity;

public interface StudentRepository extends JpaRepository<StudentEntity,Long>{

  
}
