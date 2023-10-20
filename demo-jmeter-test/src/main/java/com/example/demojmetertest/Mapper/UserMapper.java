package com.example.demojmetertest.Mapper;

import com.example.demojmetertest.Dto.UserDTO;
import com.example.demojmetertest.Entity.User;

public class UserMapper {


  public static User map(UserDTO userDTO) {
    return User.builder()//
        .userId(userDTO.getUserId())//
        .userName(userDTO.getName())//
        .age(userDTO.getAge())//
        .build();
  }
}
