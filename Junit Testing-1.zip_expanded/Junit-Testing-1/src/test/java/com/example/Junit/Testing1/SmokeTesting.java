package com.example.Junit.Testing1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.Junit.Testing1.controller.HomeController;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

@SpringBootTest
public class SmokeTesting {
	@Autowired
	private HomeController controller;
	
	@Test
	public void contextLoads() throws Exception{
		assertThat(controller).isNotNull();
	}
}
