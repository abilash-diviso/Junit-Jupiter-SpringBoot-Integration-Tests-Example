package com.diviso.JunitTest.params;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class ParameterizedValueSourceTest {

	@ParameterizedTest
	@ValueSource(strings = { "racecar", "radar", "able was I ere I saw elba" })
	void equals(String candidate) {
		assertTrue(candidate.equals("racecar") || candidate.equals("radar")
				|| candidate.equals("able was I ere I saw elba"));

	}

	@ParameterizedTest
	@ValueSource(ints = { 1, 2, 3 })
	void testWithValueSource(int value) {
		assertTrue(value > 0 && value < 4);
	}

}
