package com.sprintboot.io.controller;

import java.util.Collections;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestDocsController {

    @GetMapping("/restdocs")
    public Map<String, Object> greeting() {
        return Collections.singletonMap("message", "RestDocs!!!");
    }

}