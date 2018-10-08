package com.example.demo.hello;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@RestController
public class HelloController implements WebMvcConfigurer {

	@Autowired
	HelloMsgService service;

	@RequestMapping("/hello")
	public List<HelloMsg> sayHello() {
		return service.getAllMsgs();
	}
	
	@RequestMapping("/hello/{id}")
	public HelloMsg getMsg(@PathVariable int id) {
		return service.getMsg(id);
	}
	
	
}
