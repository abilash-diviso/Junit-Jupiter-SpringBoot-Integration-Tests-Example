package com.diviso.JunitTest.params;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.diviso.JunitTest.Book;

class ParameterizedStringToObjectConversionTest {

	@ParameterizedTest
	@ValueSource(strings = { "alchemist" })
	void testWithImplicitFallbackArgumentConversion(Book book) {

		assertEquals("alchemist", book.getTitle());
	}

}
