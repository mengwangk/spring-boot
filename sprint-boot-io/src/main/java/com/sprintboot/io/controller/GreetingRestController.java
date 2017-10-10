package com.sprintboot.io.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sprintboot.io.pojo.Greeting;

@CrossOrigin(origins = "http://localhost:9000")
@RestController
public class GreetingRestController {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@RequestMapping(method = RequestMethod.GET, value = "/greeting-rest")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}
	
	 @GetMapping("/greeting-javaconfig")
	    public Greeting greetingWithJavaconfig(@RequestParam(required=false, defaultValue="World") String name) {
	        System.out.println("==== in greeting ====");
	        return new Greeting(counter.incrementAndGet(), String.format(template, name));
	    }

}