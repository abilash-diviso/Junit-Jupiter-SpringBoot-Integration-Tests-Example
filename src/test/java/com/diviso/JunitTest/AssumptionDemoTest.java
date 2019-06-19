package com.diviso.JunitTest;

import static org.junit.jupiter.api.Assumptions.assumeTrue;
import static org.junit.jupiter.api.Assumptions.assumingThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class AssumptionDemoTest {

	@Test
	void testOnlyOnCiServer() {
		System.out.println("+++++++++++++++++++++=" + System.getenv());
		assumeTrue("CI".equals(System.getenv("ENV")));
	}

	@Test
	void testOnlyOnDeveloperWorkstation() {
		System.out.println("Env is " + System.getenv("ENV"));
		assumeTrue("DEV".equals(System.getenv("ENV")), () -> "Aborting test: not on developer workstation");
        // remainder of test

	}

	@Test
	void testInAllEnvironments() {
        // perform these assertions only on the CI server

		assumingThat("CI".equals(System.getenv("ENV")), () -> assertEquals(2, 2));
		
		// perform these assertions in all environments
        assertEquals("a string", "a string");
	}

}
