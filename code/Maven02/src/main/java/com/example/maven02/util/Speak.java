package com.example.maven02.util;

import  com.example.maven.test.HelloWorld;

public class Speak{
	
	public String sayHi(){
		return new HelloWorld().getStr();
	}
	
	
}