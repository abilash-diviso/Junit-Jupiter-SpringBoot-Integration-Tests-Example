package com.diviso.JunitTest.params;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class ParameterizedMethodSourceTest {

	@ParameterizedTest
	@MethodSource("stringProvider")
	void testWithSimpleMethodSource(String argument) {

		assertNotNull(argument);
	}

	static Stream<String> stringProvider() {
		return Stream.of("foo", "bar");
	}

	@ParameterizedTest
	@MethodSource
	void testWithSimpleMethodSourceHavingNoValue(String argument) {
		assertNotNull(argument);
	}

	static Stream<String> testWithSimpleMethodSourceHavingNoValue() {
		return Stream.of("zab", "baz");
	}

	@ParameterizedTest
	@MethodSource("range")
	void testWithRangeMethodSource(int argument) {

		assertNotEquals(9, argument);

	}

	static IntStream range() {
		return IntStream.range(0, 20).skip(10);
	}

	@ParameterizedTest
	@MethodSource("stringIntAndListProvider")
	void testWithMultiArgMethodSource(String str, int num, java.util.List<String> list) {
		assertEquals(3, str.length());
		assertTrue(num >= 1 || num <= 2);
		assertEquals(2, list.size());
	}

	static Stream<Arguments> stringIntAndListProvider() {
		return Stream.of(Arguments.arguments("foo", 1, Arrays.asList("x", "y")),
				Arguments.arguments("bar", 2, Arrays.asList("p", "q"))

		);
	}
	
	

}
