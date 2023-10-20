package com.example.demojunittest.model;

import java.io.Serializable;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder
@EqualsAndHashCode
public class UserRedis implements Serializable {

  private String id;

  private String user_id;

  private String user_name;

  private String age;
}
