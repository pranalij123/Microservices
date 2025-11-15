package com.erp.multi_service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mult")
public class MultController {

	@GetMapping("/{a}/{b}")
    public int mult(@PathVariable int a, @PathVariable int b) {
        return a * b;
    }

}
