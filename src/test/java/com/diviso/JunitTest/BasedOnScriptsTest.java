package com.diviso.JunitTest;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIf;
import org.junit.jupiter.api.condition.EnabledIf;

//javascript can use any scripting languages like groovy
class BasedOnScriptsTest {

	@Test
	@EnabledIf("2*3==6")
	void willBeExecuted() {
	}

	@DisabledIf("Math.random()<0.314159")
	@RepeatedTest(10)
	void mightNotBeExecuted() {
		System.out.println("repeatedTest");
	}

	@Test
	@EnabledIf("'CI'==systemEnvironment.get('ENV')")
	void disabledOn32BitArchitecture() {
		System.out.println("disabledOn32BitArchitecture");

	}

	@Test
	@EnabledIf(value = { "load('nashorn:mozilla_compat.js')", "importPackage(java.time)", "",
			"var today = LocalDate.now()", "var tomorrow = today.plusDays(1)",
			"tomorrow.isAfter(today)" }, engine = "nashorn", reason = "Self-fulfilling: {result}")
	void multiLineScriptUsingNashorn() {
		LocalDate today = LocalDate.now();
		LocalDate tomorrow = today.plusDays(1);
		assertTrue(tomorrow.isAfter(today));
	}

}
