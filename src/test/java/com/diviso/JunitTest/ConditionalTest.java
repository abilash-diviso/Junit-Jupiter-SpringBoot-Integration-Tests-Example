package com.diviso.JunitTest;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

class ConditionalTest {

	@Test
	@EnabledOnOs(OS.MAC)
	void onlyOnMacOS() {
	
	}
	
	@TestOnLinux
	void testOnLinux() {
		
		System.out.println("Custom composed testOnLinux");
	}
	
	@Test
	@EnabledOnOs({OS.LINUX,OS.MAC})
	void onLinuxOrMac() {

		System.out.println("onLinuxOrMac");
		
	}
	
	@Test
	@DisabledOnOs(OS.WINDOWS)
	void notOnWindows() {

		
	}
	
	@Test
	@Retention(RetentionPolicy.RUNTIME)
	@Target(ElementType.METHOD)
	@EnabledOnOs(OS.LINUX)
	@interface TestOnLinux{
		
	}

}
