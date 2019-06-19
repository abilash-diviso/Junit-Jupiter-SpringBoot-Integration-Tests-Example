package com.diviso.JunitTest.params;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class ParameterizedCSvSourceTest {

	@ParameterizedTest
	@CsvSource({ "foo,1", "bar,2", "baz,3", "'vadakkeveedu,kudallur',4", "'',5", /*",6"*/ })
	void testWithCsvSource(String str, int num) {
		assertNotNull(str);
		assertNotEquals(0, num);

	}

	@ParameterizedTest
	@CsvFileSource(resources = "/two-coloumn.csv", numLinesToSkip = 1)
	void testWithCSVFileSource(String name, int age) {
		assertNotNull(name);
		assertNotEquals(0, age);

	}

}
