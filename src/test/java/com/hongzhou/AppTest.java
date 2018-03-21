package com.hongzhou;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.hongzhou.controller.HomeController;


public class AppTest {
	
	@Test
    public void testApp(){
		HomeController hc = new HomeController();
		String result = hc.home();
		assertEquals(result, "Hong Zhou, Spring boot application!");
    }
}
