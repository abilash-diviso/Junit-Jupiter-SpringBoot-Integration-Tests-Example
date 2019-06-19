package com.diviso.JunitTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public interface EqualsContractTest<T> extends Testable<T> {

	T createNotEqualValue();

	@Test
	default void valueEqualsItself() {
		T value = createValue();
		assertEquals(value, value);
	}

	@Test
	default void valueDoesNotEqualsNull() {
		T value = createValue();
		assertFalse(value.equals(null));
	}

	@Test
	default void valueDoesNotEqualDifferentValue() {
		T value = createValue();
		T differentValue = createNotEqualValue();
		assertNotEquals(value, differentValue);
		assertNotEquals(differentValue, value);
	}

}
