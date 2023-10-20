package com.example.demojmetertest.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demojmetertest.Entity.User;

public interface UserRepository extends JpaRepository<User,Long>{
  
}
