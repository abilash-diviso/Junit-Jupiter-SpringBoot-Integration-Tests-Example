package com.diviso.JunitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;

class EnvironmentVariableConditionsTest {

	@Test
	@EnabledIfEnvironmentVariable(named = "ENV", matches = "staging-server")
	void onlyOnStagingServer() {
		System.out.println("It is a staging server");

	}

	@Test
	@EnabledIfEnvironmentVariable(named = "ENV", matches = ".*development.*")
	void onlyOnDeveloperWorkstation() {
		System.out.println("On developer workstation");

	}

}
