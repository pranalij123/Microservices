package com.erp.add_service;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/add")
public class AddController {

    @GetMapping("/{a}/{b}")
    public int add(@PathVariable int a, @PathVariable int b) {
        return a + b;
    }
}
