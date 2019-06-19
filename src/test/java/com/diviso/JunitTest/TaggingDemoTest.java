package com.diviso.JunitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;


@Tag("model")
@Tag("fast")
class TaggingDemoTest {

	@Test
	@Tag("taxes")
	void testingTaxCalculation() {

	
	}

}
