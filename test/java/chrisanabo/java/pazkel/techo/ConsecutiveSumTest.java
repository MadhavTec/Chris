package chrisanabo.java.pazkel.techo;

import junit.framework.TestCase;

public class ConsecutiveSumTest extends TestCase {

	public void testConsecutiveTest1() {

		int num = 15;

		int expected = ConsecutiveSum.consecutive(num);

		int actual = 3;

		assertEquals(expected, actual);

	}

	public void testConsecutiveTest2() {

		int num = 10;

		int expected = ConsecutiveSum.consecutive(num);

		int actual = 1;

		assertEquals(expected, actual);

	}
}
