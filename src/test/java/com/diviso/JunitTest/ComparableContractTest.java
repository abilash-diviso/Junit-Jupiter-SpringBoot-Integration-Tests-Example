package com.diviso.JunitTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public interface ComparableContractTest<T extends Comparable<T>> extends Testable<T> {

	T createSmallerValue();

	@Test
	default void reurnsZeroIfComparedToItself() {
		T value = createValue();
		assertEquals(0, value.compareTo(value));
	}

	@Test
	default void returnsPositiveNumberWhenComparedToSmallerValue() {
		T value = createValue();
		T smallerValue = createSmallerValue();
		assertTrue(value.compareTo(smallerValue) > 0);
	}

	default void returnsNegativeNumberWhenComparedToSmallerValue() {
		T value = createValue();
		T smallervalue = createSmallerValue();
		assertTrue(smallervalue.compareTo(value) > 0);
	}

}
