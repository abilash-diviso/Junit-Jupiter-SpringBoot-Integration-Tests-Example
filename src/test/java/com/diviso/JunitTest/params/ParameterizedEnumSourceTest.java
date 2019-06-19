package com.diviso.JunitTest.params;

import static org.junit.jupiter.api.Assertions.*;

import java.util.EnumSet;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.EnumSource.Mode;

class ParameterizedEnumSourceTest {

	@ParameterizedTest
	@EnumSource(TimeUnit.class)
	void testWithEnumSource(TimeUnit timeUnits) {
		assertNotNull(timeUnits);

	}

	@ParameterizedTest
	@EnumSource(value = TimeUnit.class, names = { "DAYS", "HOURS" })
	void testWithEnumSourceInclude(TimeUnit timeUnits) {

		assertTrue(EnumSet.of(TimeUnit.DAYS, TimeUnit.HOURS).contains(timeUnits));

	}

	@ParameterizedTest
	@EnumSource(value = TimeUnit.class, mode = Mode.EXCLUDE, names = { "DAYS", "HOURS" })
	void testWithEnumSourceExclude(TimeUnit timeUnits) {
		assertFalse(EnumSet.of(TimeUnit.DAYS, TimeUnit.HOURS).contains(timeUnits));
		assertTrue(timeUnits.name().length() > 6);
	}

	@ParameterizedTest
	@EnumSource(value = TimeUnit.class, mode = Mode.MATCH_ALL, names = "^(M|N).+SECONDS$")
	void testWithEnumSourceRegex(TimeUnit timeUnit) {
		assertTrue(timeUnit.name().startsWith("M") || timeUnit.name().startsWith("N"));
		assertTrue(timeUnit.name().endsWith("SECONDS"));

	}

}
