package com.diviso.JunitTest.params;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.converter.JavaTimeConversionPattern;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.ValueSource;

import com.diviso.JunitTest.ToStringArgumentConverter;

class ParameterizedExplicitConversionTest {

	@ParameterizedTest
	@EnumSource(TimeUnit.class)
	void testWithExplicitArgumentConversion(@ConvertWith(ToStringArgumentConverter.class) String argument) {

		assertNotNull(TimeUnit.valueOf(argument));

	}

	@ParameterizedTest
	@ValueSource(strings = { "01.01.2017", "31.12.2017" })
	void testWithExplicitJavaTimeConverter(@JavaTimeConversionPattern("dd.MM.yyyy") LocalDate localDate) {
		assertEquals(2017, localDate.getYear());

	}

}
