package com.example.Junit.Testing1.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.example.Junit.Testing1.controller.HomeController;

public class TestHomeController {
	@Test
	public void testHomeController() {
		HomeController homeController  = new HomeController();
		String result = homeController.home();
		assertEquals(result,"Hello World! From Arpit");
	}
}
