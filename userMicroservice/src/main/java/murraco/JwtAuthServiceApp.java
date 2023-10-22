package murraco;

import java.util.ArrayList;
import java.util.Arrays;

import lombok.RequiredArgsConstructor;
import murraco.model.AppUser;
import murraco.model.AppUserRole;
import org.modelmapper.ModelMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

import murraco.service.UserService;

@SpringBootApplication
@RequiredArgsConstructor
@EnableEurekaClient
public class JwtAuthServiceApp implements CommandLineRunner {

  final UserService userService;

  public static void main(String[] args) {
    SpringApplication.run(JwtAuthServiceApp.class, args);
  }

  @Bean
  public ModelMapper modelMapper() {
    return new ModelMapper();
  }

  @Override
  public void run(String... params) throws Exception {

  }

}