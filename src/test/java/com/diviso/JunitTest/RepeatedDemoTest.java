package com.diviso.JunitTest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.logging.Logger;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.TestInfo;

class RepeatedDemoTest {

	private static final Logger log = Logger.getLogger(RepeatedDemoTest.class.getName());

	@BeforeEach
	void beforeEach(TestInfo testInfo, RepetitionInfo repetitionInfo) {
		int currentPosition = repetitionInfo.getCurrentRepetition();
		int totalRepitions = repetitionInfo.getTotalRepetitions();
		String methodName = testInfo.getTestMethod().get().getName();
		log.info(String.format("About to execute repition %d of %d for %s", currentPosition, totalRepitions,
				methodName));

	}

	@RepeatedTest(10)
	void repeatedTest() {
	}

	@RepeatedTest(5)
	void repeatedTestrepetionInfo(RepetitionInfo repetitionInfo) {
		assertEquals(5, repetitionInfo.getTotalRepetitions());
	}

	@RepeatedTest(value = 1, name = "{displayName} {currentRepetition}/{totalRepetitions}")
	@DisplayName("Repeat!")
	void customdisplayName(TestInfo testInfo) {
		assertEquals("Repeat! 1/1", testInfo.getDisplayName());
	}

	@RepeatedTest(value = 1, name = RepeatedTest.LONG_DISPLAY_NAME)
	@DisplayName("Details...")
	void customDisplayNameWithLongPattern(TestInfo testInfo) {

		assertEquals("Details... :: repetition 1 of 1", testInfo.getDisplayName());
	}

	@RepeatedTest(value = 5, name = "Wiederholung {currentRepetition} von {totalRepetitions}")
	void repeatedTestInGerman() {

	}

}
