package com.erp.sub_service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sub")
public class SubController {

	@GetMapping("/{a}/{b}")
    public int sub(@PathVariable int a, @PathVariable int b) {
        return a - b;
    }

}
