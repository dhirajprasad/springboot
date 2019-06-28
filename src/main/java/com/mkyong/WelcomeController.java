package com.mkyong;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mkyong.util.Util;


@Controller
public class WelcomeController {

	// inject via application.properties
	@Value("${welcome.message:test}")
	private String message = "Hello World";
	@Autowired
	private Util util ;
	@RequestMapping("/")
	public String welcome(Map<String, Object> model) {
		model.put("message", util.getMessage());
		return "welcome";
	}

}