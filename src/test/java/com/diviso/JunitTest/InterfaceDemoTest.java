package com.diviso.JunitTest;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class InterfaceDemoTest implements TestLifecycleLogger, TimeExecutionLogger, InterfaceDynamicTest {

	@Test
	void isEqualValue() {
		assertEquals(1, 1);
	}

}
