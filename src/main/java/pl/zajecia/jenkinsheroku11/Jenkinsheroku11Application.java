package pl.zajecia.jenkinsheroku11;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Jenkinsheroku11Application {

	public static void main(String[] args) {
		SpringApplication.run(Jenkinsheroku11Application.class, args);
	}

	@GetMapping
	public String get()
	{
		return "Hello";
	}
}
