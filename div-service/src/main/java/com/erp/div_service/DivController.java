package com.erp.div_service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/div")
public class DivController {

	 @GetMapping("/{a}/{b}")
	    public int div(@PathVariable int a, @PathVariable int b) {
	        return a/b;
	    }

}
