package com.example.demo;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@ComponentScan
@RestController
public class HelloWorldController {
	//get request http://localhost:8080/hello-world
	@GetMapping("/hello")
	public String helloworld() {
		return "hello world";
	}

}
