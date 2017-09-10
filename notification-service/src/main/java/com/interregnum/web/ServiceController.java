package com.interregnum.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.interregnum.component.TestMessageSender;

@RestController
public class ServiceController {
	
	//@RequestMapping("/test")
	@Autowired
	private TestMessageSender tms;
	
	@GetMapping("/test")
	public String testReturn() {

		return (String) (tms.testSend("CJZ"));
	}
}
