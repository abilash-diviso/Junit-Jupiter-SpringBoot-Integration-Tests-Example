package com.diviso.JunitTest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Properties;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.junit.jupiter.api.parallel.ResourceAccessMode;
import org.junit.jupiter.api.parallel.ResourceLock;

@Execution(ExecutionMode.CONCURRENT)
class ParallelExecutionTest {

	private Properties backup;

	@BeforeEach
	void backup() {

		backup = new Properties();
		backup.putAll(System.getProperties());

	}

	@AfterEach
	void restore() {
		System.setProperties(backup);
	}

	@Test
	@ResourceLock(mode = ResourceAccessMode.READ, value = "SYSTEM_PROPERTIES")
	void customPropertyIsNotSetByDefault() {
		/*
		 * try { Thread.sleep(10000l); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */


		assertNull(System.getProperty("my.prop"));
		System.out.println("Properties are " + System.getProperty("SYSTEM_PROPERTIES"));
	}

	@Test
	@ResourceLock(mode = ResourceAccessMode.READ_WRITE, value = "SYSTEM_PROPERTIES")
	void canSetCustomPropertyToFoo() {
		/*
		 * try { Thread.sleep(10000l); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
	

		System.setProperty("my.prop", "foo");
		assertEquals("foo", System.getProperty("my.prop"));
	}

	@Test
	@ResourceLock(mode = ResourceAccessMode.READ_WRITE, value = "SYSTEM_PROPERTIES")
	void canSetCustomPropertyToBar() {
		/*
		 * try { Thread.sleep(10000l); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */

	

		System.setProperty("my.prop", "bar");
		assertEquals("bar", System.getProperty("my.prop"));
	}

}
