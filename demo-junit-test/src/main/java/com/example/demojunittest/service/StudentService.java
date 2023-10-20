package com.example.demojunittest.service;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import com.example.demojunittest.mapper.EntityMapper;
import com.example.demojunittest.model.Student;
import com.example.demojunittest.repository.StudentRepository;

@Service
public class StudentService {


  @Autowired
  StudentRepository studentRepository;

  @Value(value = "${api.jmeter.domain}")
  String domain;

  @Value(value = "${api.jmeter.basePath}")
  String basePath;

  @Value(value = "${api.jmeter.endpoint}")
  String endpoint;

  @Autowired
  RestTemplate restTemplate;

  public String getDB() {
    return new Student("John", 30).concat("Chan");
  }

  public String getStudentName(String name) {
    if (name == null)
      throw new IllegalArgumentException();
    return this.getDB();
  }

  public List<Student> findAll() {
    return studentRepository.findAll().stream()//
        .map(e -> EntityMapper.map(e))//
        .collect(Collectors.toList());
  }

  public String jmeterTest() {
    String url = UriComponentsBuilder.newInstance()//
        .scheme("http")//
        .host(domain)//
        .pathSegment(basePath)//
        .path(endpoint)//
        .build()//
        .toUriString();
    System.out.println("demo-junit-test : url = " + url);
    try {
      return restTemplate.getForObject(url, String.class);
    } catch (RestClientException e) {
      System.out.println("error");
      return null;
    }
  }
}
