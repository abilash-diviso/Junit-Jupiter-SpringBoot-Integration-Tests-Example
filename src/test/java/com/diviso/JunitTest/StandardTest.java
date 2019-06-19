package com.diviso.JunitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@DisplayName("Standard Test Demos")
/*
 * @TestInstance(Lifecycle.PER_CLASS)
 */class StandardTest {
	
	int i=10;

	@Test
	@Disabled
	void failingTest() {
		
		System.out.println("Failing test "+i);
		i++;
		fail("Not yet implemented");
	}

	@BeforeAll
	static void initAll() {
		System.out.println("BeforeAll");
	}

	@BeforeEach
	void init() {
		System.out.println("beforeEach");
	}

	@Test
	void succeedTesting() {
		i++;
		System.out.println("Suceesding test "+i);
	}

	@Test
	@Disabled("For Demonstration purpose ")
	void skippedTest() {
		System.out.println("disabled or skipped test ");

	}

	@AfterAll
	static void tearDownAll() {
		System.out.println("After all");
	}

	@AfterEach
	void tearDown() {
		System.out.println("After each ");
	}

	@Test
	@DisplayName("Custom test name containing spaces")
	void testWithDisplayNameContainingSpces() {
		i++;
		System.out.println("Custom test name containing spaces "+i);
	}
	
	@Test
	@DisplayName("Custom test name containing spcial chars ╯°□°）╯ ")
	void testWithDisplayNameContainingSpecialChars() {
		i++; 
		System.out.println("Custom test name containing spcial chars "+i);
	}
	@Test
	@DisplayName("Custom test name containing Emojis 😱")
	void testWithDisplayNameContainingEmojis() {
		i++;
		System.out.println("Custom test name containing spaces "+i);
	}
	
}
