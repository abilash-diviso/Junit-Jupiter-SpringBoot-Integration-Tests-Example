package com.diviso.JunitTest;

import java.util.logging.Logger;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.Test;

@TestInstance(Lifecycle.PER_CLASS)
 interface TestLifecycleLogger {

	Logger log = Logger.getLogger(TestLifecycleLogger.class.getName());

	@BeforeAll
	default void beforeAllTests() {
		log.info("Before All Tests");
	}

	@AfterAll
	default void afterAlltests() {
		log.info("After All Tests");
	}

	@BeforeEach
	default void beforeEach(TestInfo testInfo) {
		log.info(() -> String.format("About to execute [%s]", testInfo.getDisplayName()));
	}

	@AfterEach
	default void afterEach(TestInfo testInfo) {
		log.info(() -> String.format("Finished Executing [%s]", testInfo.getDisplayName()));
	}

}
