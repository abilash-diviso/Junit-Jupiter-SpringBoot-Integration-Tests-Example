package com.diviso.JunitTest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Map;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestReporter;

class DITestReporterDemoTest {

	@Test
	void reportSingleEntry(TestReporter testReporter) {
		testReporter.publishEntry("Single Value");
	}

	void reportKeyValuePair(TestReporter testReporter) {
		testReporter.publishEntry("a key", "a value");
	}

	/*void reportKeyValuePairs(TestReporter testReporter) {

		testReporter.publishEntry(

				Map.of(

						"key1", "value1", "key2", "value2", "key3", "value3"));
	}*/
}
