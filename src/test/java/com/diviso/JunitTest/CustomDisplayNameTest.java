package com.diviso.JunitTest;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CustomDisplayNameTest {

	@DisplayName("Display name of the container")
	@ParameterizedTest(name = "{arguments} ===>>>{index}==> first= {0} second= {1}")
	@CsvSource({ "foo,1", "bar,2", "'bar,qux',3" })
	public void customDisplayName(String first, int second) {

		assertNotNull(first);
	}

}
