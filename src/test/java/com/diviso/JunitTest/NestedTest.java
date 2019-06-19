package com.diviso.JunitTest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.EmptyStackException;
import java.util.Stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

class NestedTest {

	Stack<String> stack;

	@Test
	@DisplayName("is instantiated with new Stack()")
	void isInstantiatedWithNew() {

		stack = new Stack<>();

	}

	@Nested
	@DisplayName("when new")
	/* If wanted to use @BeforeAll and @AfterAll */
	/* @TestInstance(Lifecycle.PER_CLASS) */
	class whenNew {

		@BeforeEach
		@DisplayName("Instantiate New ")
		void instantiateStack() {
			stack = new Stack<>();
		}

		@Test
		@DisplayName("Is empty stack ")
		void isEmpty() {
			assertTrue(stack.isEmpty());

		}

		@Test
		@DisplayName("throws exception when popped")
		void throwsExceptionWhenPopped() {
			assertThrows(EmptyStackException.class, () -> stack.pop());
		}

		void throwsExceptionWhenPeeked() {
			assertThrows(EmptyStackException.class, () -> stack.peek());
		}

		@Nested
		@DisplayName("After pushing")
		class AfterPushing {

			String element = "An Element";

			@BeforeEach
			@DisplayName("Pushing an element ")
			void pushAnElement() {
				stack.push(element);
			}

			@Test
			@DisplayName("Stack is not empty")
			void isNotEmpty() {
				assertFalse(stack.isEmpty());
			}

			@Test
			@DisplayName("Return element when popped and is empty")
			void returnElementWhenPopped() {
				assertEquals("An Element", stack.pop());
				assertTrue(stack.isEmpty());
			}

			@Test
			@DisplayName("return element when peeked and is empty false")
			void returnElementWhenPeeked() {
				assertEquals("An Element", stack.peek());
				assertFalse(stack.isEmpty());
			}

		}

	}

}
