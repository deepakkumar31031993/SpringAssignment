package com.example.demo.hello;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class HelloMsgService {

	private List<HelloMsg> allMsgs = Arrays.asList(
			new HelloMsg(1,"Hello World"),new HelloMsg(2,"Hello World.!!!")
			);
	
	public List<HelloMsg> getAllMsgs(){
		
		return allMsgs;
	}
	
	public HelloMsg getMsg(int id ) {
		
		return allMsgs.stream().filter(m -> m.getId() == id).findFirst().get();
	}
}
