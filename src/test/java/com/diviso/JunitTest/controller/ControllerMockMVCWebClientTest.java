package com.diviso.JunitTest.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.reactive.server.WebTestClient;


@SpringBootTest
@AutoConfigureWebTestClient
public class ControllerMockMVCWebClientTest {

	@Autowired
	private WebTestClient webClient;

	@Test
	public void testClient() {

		this.webClient.get().uri("/Maya").exchange().expectStatus().isOk().expectBody(String.class).isEqualTo("Hai Maya");

	}

}
