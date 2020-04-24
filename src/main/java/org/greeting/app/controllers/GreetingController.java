package org.greeting.app.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class GreetingController {
	@RequestMapping(method = RequestMethod.GET,path = "/greetUser")
	public String greetUser(@RequestParam(value = "username") String username){
		return "Hello "+ username;
	}
}
