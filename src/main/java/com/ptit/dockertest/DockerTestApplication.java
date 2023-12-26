package com.ptit.dockertest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/api/v1")
public class DockerTestApplication {

  public static void main(String[] args) {
    SpringApplication.run(DockerTestApplication.class, args);
  }

  @GetMapping("/hello")
  public String hello() {
    return "Hello from Nguyen Minh Hieu. I am test docker in server";
  }

}
