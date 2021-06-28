package com.example.dispatch.dispatch.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/dispatch")
public class DefaultController {

    @GetMapping("/")
    public String init() {
        return "Welcome";
    }
}