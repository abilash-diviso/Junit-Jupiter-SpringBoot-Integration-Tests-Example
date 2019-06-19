package com.diviso.JunitTest.controller;

import org.springframework.boot.test.mock.mockito.*;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MockObjectTest {

	@MockBean
	private RemoteService remoteService;

	@Autowired
	private Reverser reverser;

	@Test
	public void mockExampleTest() {

		given(remoteService.someCall()).willReturn("mock");
		System.out.println(remoteService.someCall());
		/*
		 * String reversedString = reverser.someCall(); if(reverser instanceof
		 * RemoteService) System.out.println("Value is ++++++++++++++"+reversedString);
		 * assertThat(reversedString).isEqualTo("mock");
		 */

	}

}
