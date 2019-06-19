package com.diviso.JunitTest;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.JRE;

class JavaRuntimeEnivironmentConditionTest {

	@Test
	@EnabledOnJre(JRE.JAVA_8)
	void enabledOnJava8() {

		System.out.println("Enabled on jre8");

	}
	
	@Test
	@EnabledOnJre({JRE.JAVA_10,JRE.JAVA_9})
	void enabledOnJava9OrJava10() {
		System.out.println("enabledOnJava9OrJava10");
	}
	
	@Test
	@DisabledOnJre(JRE.JAVA_9)
	void notOnJava9() {
		
		System.out.println("Not on Java 9");
	}

}
