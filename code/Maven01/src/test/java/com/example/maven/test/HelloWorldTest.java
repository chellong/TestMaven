package com.example.maven.test;

import org.junit.*;
import org.junit.Assert.*;

public class HelloWorldTest{
	
	@Test
	public void testHelloWorld(){
		Assert.assertEquals("HelloWorld",new HelloWorld().getStr());
	}
}