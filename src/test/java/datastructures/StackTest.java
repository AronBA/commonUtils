package datastructures;

import dev.aronba.commonutils.datastructures.Stack;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNull;

public class StackTest {

	@Test
	void testNewStackIsEmpty() {
		var stack = new Stack(5);
		Assertions.assertTrue(stack.isEmpty());
	}

	@Test
	void testSizeOfNewStackIsZero() {
		var stack = new Stack(5);
		Assertions.assertEquals(0, stack.size());
	}

	@Test
	void testStackWithZeroCapacityIsFull() {
		var stack = new Stack(0);
		Assertions.assertTrue(stack.isFull());
	}

	@Test
	void testPopOnEmptyStackReturnsNull() {
		var stack = new Stack(3);
		assertNull(stack.pop());
	}

	@Test
	void testStackHasCorrectSizeAfterInitializationWithElements() {
		var stack = new Stack(5);
		stack.push("lorem");
		stack.push("ipsum");
		stack.push("dolor");
		stack.push("sit");
		Assertions.assertEquals(4, stack.size());
	}

	@Test
	void testStackContainsElementsOfInitialization() {
		var stack = new Stack(5);
		stack.push("Ein");
		stack.push("Ring");
		stack.push("sie");
		stack.push("zu");
		stack.push("knechten");
		Assertions.assertEquals("knechten", stack.pop());
		Assertions.assertEquals("zu", stack.pop());
		Assertions.assertEquals("sie", stack.pop());
		Assertions.assertEquals("Ring", stack.pop());
		Assertions.assertEquals("Ein", stack.pop());
	}

	@Test
	void testStackIsEmptyAfterAllPopped() {
		var stack = new Stack(6);
		stack.push("To");
		stack.push("be");
		stack.push("or");
		stack.push("not");
		stack.push("to");
		stack.push("be");

		for (int i = 0; i < 6; i++) {
			stack.pop();
		}
		Assertions.assertTrue(stack.isEmpty());
	}
}
