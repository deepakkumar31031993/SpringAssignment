package com.example.demo.hello;

public class HelloMsg {

	int id;
	String text;
	public HelloMsg() {
		// TODO Auto-generated constructor stub
	}
	HelloMsg(int id ,String text){
		this.id= id;
		this.text = text;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	
}
