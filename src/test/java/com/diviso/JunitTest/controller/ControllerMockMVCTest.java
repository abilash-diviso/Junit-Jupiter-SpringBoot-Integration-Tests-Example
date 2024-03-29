package com.diviso.JunitTest.controller;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import com.diviso.JunitTest.App;

@SpringBootTest(classes=App.class)
@AutoConfigureMockMvc
public class ControllerMockMVCTest {

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void exampleTest() throws Exception {

		this.mockMvc.perform(get("/Maya")).andExpect(status().isOk()).andExpect(content().string("Hai Maya"));
	}

}
