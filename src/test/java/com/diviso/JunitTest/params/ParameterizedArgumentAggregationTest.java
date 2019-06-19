package com.diviso.JunitTest.params;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.aggregator.ArgumentsAccessor;
import org.junit.jupiter.params.provider.CsvSource;

import com.diviso.JunitTest.Gender;
import com.diviso.JunitTest.Person;

class ParameterizedArgumentAggregationTest {

	@ParameterizedTest
	@CsvSource({ "jhon,doe,M,1990-02-21", "jane,doe,F,1990-03-25" })
	void testWithArgumentsAccessor(ArgumentsAccessor argumentsAccessor) {
		Person person = new Person(argumentsAccessor.getString(0), argumentsAccessor.getString(1),
				argumentsAccessor.get(2, Gender.class), argumentsAccessor.get(3, LocalDate.class));

		if (person.getFirstName().equals("jhon")) {
			assertEquals(Gender.M, person.getGender());
		} else {
			assertEquals(Gender.F, person.getGender());
		}

		assertEquals("doe", person.getLastName());
		assertEquals(1990, person.getDob().getYear());

	}

}
