// This is final july code for test and build.
// the july code ia awhole packege now.



//This is vaibhav shinde addition
//all code  addition is from the point f view of july release.

// I am doing some modification as per suggestions got from quality team.

// This is july's first week code branch. Kindly consider it. Make a note of it.

package com.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class TestController {
	public TestController() {
		log.info("in ctor of "+getClass());
	}
	@GetMapping("/home")
	public String showHome()
	{
		return "in home page...";//@RespBody 
	}
	@GetMapping("/user")
	public String showUser()
	{
		return "in user page...";//@RespBody 
	}
	@GetMapping("/admin")
	public String showAdmin()
	{
		return "in admin page...in admin page...";//@RespBody 
	}
/* This is comment*/
}


########Hellow all Im shubham Nnice to meet you!!!!!!!!!!!!!!!!!!!
!
!

Hi i am doing changes.

again changing.

/*
i am doing work from point of view of firstweek
*/