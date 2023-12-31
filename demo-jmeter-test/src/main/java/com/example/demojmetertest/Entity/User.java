package com.example.demojmetertest.Entity;

import java.io.Serializable;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name= "UESRS")
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)//按照駝峰命名起TABLE column名
@Getter
@Setter
@Builder
public class User implements Serializable{
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  private String userId;

  private String userName;

  private int age;
}
