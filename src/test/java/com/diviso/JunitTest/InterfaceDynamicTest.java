package com.diviso.JunitTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

public interface InterfaceDynamicTest {

	@TestFactory
	default Collection<DynamicTest> dynamicTestsFromCollection() {
		return Arrays.asList(DynamicTest.dynamicTest("First Dynamic Test in test interface", () -> assertTrue(true)),
				DynamicTest.dynamicTest("2nd Dynamic test in test interface", () -> assertEquals(4, 2 * 2))

		);

	}
}
