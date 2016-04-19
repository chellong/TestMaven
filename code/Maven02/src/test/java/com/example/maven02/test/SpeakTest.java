package com.example.maven02.test;

import org.junit.*;
import org.junit.Assert.*;

public class SpeakTest{
	
	@Test
	public void testSpeak(){
		Assert.assertEquals("HelloWorld",new Speak().sayHi());
	}
}