package com.sprintboot.io.hypermedia;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.*;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class GreetingControllerWithHypermedia {

	private static final String TEMPLATE = "Hello, %s!";

	@RequestMapping("/greeting-with-hypermedia")
	public HttpEntity<GreetingWithHypermedia> greeting(
			@RequestParam(value = "name", required = false, defaultValue = "World") String name) {

		GreetingWithHypermedia greeting = new GreetingWithHypermedia(String.format(TEMPLATE, name));
		greeting.add(linkTo(methodOn(GreetingControllerWithHypermedia.class).greeting(name)).withSelfRel());

		return new ResponseEntity<GreetingWithHypermedia>(greeting, HttpStatus.OK);
	}
}