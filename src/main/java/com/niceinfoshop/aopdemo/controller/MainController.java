package com.niceinfoshop.aopdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.extern.slf4j.Slf4j;

//@RestController
@Controller
@Slf4j
public class MainController {
	@GetMapping("/")
	@ResponseBody
	public String home() {
		log.info("AOP TEST");
		return "hello, world !!!";
	}
	
	@GetMapping("/{id}/{name}")
	@ResponseBody
	public String home2(@PathVariable("id") String id, @PathVariable("name") String name) {
		log.info("AOP TEST2 >>> {} {}", id, name);
		return "hello, world !!!";
	}
}
