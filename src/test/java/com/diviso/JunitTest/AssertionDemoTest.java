package com.diviso.JunitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;

import static java.time.Duration.ofMinutes;
import static java.time.Duration.ofMillis;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@SuppressWarnings("null")
@DisplayName("Assertion tests ")
class AssertionDemoTest {

	@Test
	void standardAssertions() {

		assertEquals(30, 15 + 15);
		assertEquals(20, 20, "Message Optional");
		assertTrue('y' < 'z', () -> "Assertion messages can be lazily evaluated -- ");

	}

	// In a grouped assertion all assertions are executed, and any
	// failures will be reported together.
	@Test
	void groupedAssertions() {

		int age = 23;
		String lastName = "maya";
		assertAll("Person",

				() -> {
					String firstName = "Peter";
					assertEquals("Peter", firstName);
				}, () -> assertEquals("maya", lastName), () -> assertEquals(23, age)

		);

	}

	@Test
	void dependentAssertions() {

		assertAll("Properties",

				() -> {
					String firstName = "rafi";
					assertNotNull(firstName);
					// Executed only if the previous assertion is valid.

					assertAll("firstName", () -> assertTrue(firstName.startsWith("r")),
							() -> assertTrue(firstName.endsWith("i")));
					// Executed only if the previous assertion is valid.
					assertTrue(10 < 20);

				},

				// Grouped assertion, so processed independently
				// of results of first name assertions.
				() -> {
					String lastName = "karthikeyan";
					assertNotNull(lastName);
					// Executed only if the previous assertion is valid.

					assertAll(() -> assertTrue(lastName.startsWith("k")), () -> assertTrue(lastName.endsWith("n")));

				}

		);

	}

	@Test
	void exceptionTesting() {
		String value = null;
		String[] values= {};
		assertAll("Exceptions",

				() -> assertThrows(NullPointerException.class,
						() -> value.length()),
				() -> assertThrows(ArrayIndexOutOfBoundsException.class, 
						() -> values[0].length())

		);
	}

	@Test
	void timeoutNotExceeded() {
		
		assertTimeout(ofMinutes(2), ()->{
			
		int sum=10+30;
		System.out.println("Sum is "+sum);
		
		});
		
	}
	
	@Test
	void timeoutNotExceededWithResult() {
		
		
		String result=assertTimeout(ofMinutes(1), ()->{
			
			return "result";
		});
		assertEquals("result", result);
	}
	
	@Test
	void timeoutNotExceededWithMethod() {
		
		String result=assertTimeout(ofMinutes(2), AssertionDemoTest::greeting);
		assertEquals("Hello, World!", result);
		
	}
	
	@Test
	@Disabled
	void timeoutExceeded() {
		
		assertTimeout(ofMillis(10), ()-> Thread.sleep(100));
	}
	
	@Test
	@Disabled
	void timeoutExceededPreemptiveTermination() {
		
		
		assertTimeoutPreemptively(ofMillis(10), ()->Thread.sleep(100));
	}
	
	private static String greeting() {
        return "Hello, World!";
    }
}
