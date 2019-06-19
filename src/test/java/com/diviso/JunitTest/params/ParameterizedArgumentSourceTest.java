package com.diviso.JunitTest.params;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;

import com.diviso.JunitTest.params.DemoArgumentProvider.NestedArgumentProvider;

class ParameterizedArgumentSourceTest {

	@ParameterizedTest
	@ArgumentsSource(DemoArgumentProvider.class)
	void testWithArgumentSource(String value) {

		assertNotNull(value);
	}

	@ParameterizedTest
	@ArgumentsSource(DemoArgumentProvider.NestedArgumentProvider.class)
	void testWithNestedStaticArgumentProviderSource(String value) {
		assertNotNull(value);
	}

}
