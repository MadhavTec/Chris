package chrisanabo.java.pazkel.techo;

import junit.framework.TestCase;

public class IntheFutureTest extends TestCase {

	public void testMinNumTest1() {

		int A = 3;
		int K = 5;
		int P = 1;

		int actual = InTheFuture.minNum(A, K, P);
		int expected = 1;
		assertEquals(expected, actual);
	}

	public void testMinNumTest2() {

		int A = 4;
		int K = 5;
		int P = 1;

		int actual = InTheFuture.minNum(A, K, P);
		int expected = 2;
		assertEquals(expected, actual);
	}
}
