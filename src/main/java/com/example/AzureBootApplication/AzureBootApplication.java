package com.example.AzureBootApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class AzureBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(AzureBootApplication.class, args);
	}

	@Controller
	class WebController {

		@GetMapping
		public String home() {
			return "index";
		}
	}
}
