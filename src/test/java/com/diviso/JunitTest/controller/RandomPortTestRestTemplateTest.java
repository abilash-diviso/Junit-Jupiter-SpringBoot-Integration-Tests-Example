package com.diviso.JunitTest.controller;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class RandomPortTestRestTemplateTest {

	@Autowired
	private TestRestTemplate testRestTemplate;

	@Test
	public void exampleRestTemplate() {

		assertFalse(false);
		String body = testRestTemplate.getForObject("/Maya", String.class);
		assertEquals("Hai Maya", body);

	}
	

}
