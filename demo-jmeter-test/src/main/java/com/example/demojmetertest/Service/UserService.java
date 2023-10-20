package com.example.demojmetertest.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demojmetertest.Entity.User;
import com.example.demojmetertest.Repository.UserRepository;

@Service
public class UserService {

  @Autowired
  UserRepository userRepository;

  public List<User> findAll() {
    return userRepository.findAll();
  }

  public User create(User user) {
    return userRepository.save(user);
  }
}
