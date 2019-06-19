package com.diviso.JunitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import com.diviso.JunitTest.RandomParametersExtension.Random;

@ExtendWith(RandomParametersExtension.class)
class RandomParameterTest {

	@Test
	void injectsInteger(@Random int i,@Random int j) {
		assertNotEquals(i, j);

	}
	
	void injectsDouble(@Random double d ) {
		
		assertEquals(0.0, d, 1.0);
	}

}
