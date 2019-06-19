package com.diviso.JunitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledIfSystemProperty;

class SystemPropertyConditionsTest {

	@Test
	@EnabledIfSystemProperty(named = "os.arch", matches = ".*64.*")
	void onlyOn64BitArchitectures() {

		System.out.println("Os is 64 bit architecture");
	}

	@Test
	@EnabledIfSystemProperty(named = "ci-server", matches = "true")
	void notOnCiServer() {
		System.out.println("It is a CI Server");

	}

}
