package com.sprintboot.io.hypermedia;

import org.springframework.hateoas.ResourceSupport;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class GreetingWithHypermedia extends ResourceSupport {

    private final String content;

    @JsonCreator
    public GreetingWithHypermedia(@JsonProperty("content") String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}