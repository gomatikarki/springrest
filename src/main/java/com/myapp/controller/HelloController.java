package com.myapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wordnik.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("myapp")
public class HelloController {
	@RequestMapping(method = RequestMethod.GET, value = "hello")
	@ApiOperation(httpMethod = "GET", value = "Say Hello using Swagger")
	public String sayHello() {
		return "Greetings from Satish Singh! ";
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "movie/{language}/{name}/{rating}" , headers = "Accept=application/json")
	@ApiOperation(httpMethod = "GET", value = "Check your movie")
	public Movie checkMovie(@RequestParam(value = "language") String language , @RequestParam(value = "name") String name ,
	@RequestParam(value = "rating") int rating) {
	Movie movie = new Movie(language , name , rating) ;
	return movie ;
	}
	
}