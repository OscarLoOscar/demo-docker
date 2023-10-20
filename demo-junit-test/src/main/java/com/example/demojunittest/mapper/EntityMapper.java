package com.example.demojunittest.mapper;

import com.example.demojunittest.Entity.StudentEntity;
import com.example.demojunittest.model.Student;

public class EntityMapper {

  public static Student map(StudentEntity entity) {
    return Student.builder()//
        .name(entity.getName())//
        .age(entity.getAge())//
        .build();
  
  }
}
