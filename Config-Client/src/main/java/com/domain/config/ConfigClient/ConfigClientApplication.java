package com.domain.config.ConfigClient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@SpringBootApplication
@RestController
public class ConfigClientApplication {

  public static void main(String[] args) {
    SpringApplication.run(ConfigClientApplication.class, args);
  }

  @Value("${message:default config}")
	private String config;

  @Value("${password}")
  private String password;

  @GetMapping("/config")
  public String getConfig() {
		return  password;
  }

}
