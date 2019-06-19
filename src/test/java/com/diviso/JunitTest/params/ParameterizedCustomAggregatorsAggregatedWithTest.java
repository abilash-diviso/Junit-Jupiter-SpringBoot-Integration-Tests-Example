package com.diviso.JunitTest.params;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.aggregator.AggregateWith;
import org.junit.jupiter.params.provider.CsvSource;

import com.diviso.JunitTest.CSVtoPerson;
import com.diviso.JunitTest.Person;
import com.diviso.JunitTest.PersonCustomAggregator;

class ParameterizedCustomAggregatorsAggregatedWithTest {

	@ParameterizedTest
	@CsvSource({ "jhon,doe,M,1990-02-21", "jane,doe,F,1990-03-25" })
	void testAggregationWithAggregatedWith(@AggregateWith(PersonCustomAggregator.class) Person person) {

		assertEquals("doe", person.getLastName());
		assertEquals(1990, person.getDob().getYear());
	}

	@ParameterizedTest
	@CsvSource({ "jhon,doe,M,1990-02-21", "jane,doe,F,1990-03-25" })
	void customAggregationWithAnnotation(@CSVtoPerson Person person) {

		assertEquals("doe", person.getLastName());
		assertEquals(1990, person.getDob().getYear());
	}

}
