package com.diviso.JunitTest;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ExternalMethodSourceDemoTest {

	@ParameterizedTest
	@MethodSource("com.diviso.JunitTest.StringProviders#tinyStrings")
	void testWithExternalMethodSource(String tinyStrings) {
		
	}
}
