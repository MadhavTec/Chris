package chrisanabo.java.pazkel.techo;

import junit.framework.TestCase;

public class FindTheWinnerTest extends TestCase {

	public void testWinnerEven() {

		int[] andrea = { 1, 2, 3 };
		int[] maria = { 2, 1, 3 };
		String game = "Even";
		String expected = "Maria";

		String actual = FindTheWinner.winner(andrea, maria, game);

		assertEquals(true, actual.equals(expected));

	}

	public void testWinnerOdd() {

		int[] andrea = { 1, 2, 3 };
		int[] maria = { 2, 1, 3 };
		String game = "Odd";
		String expected = "Andrea";

		String actual = FindTheWinner.winner(andrea, maria, game);

		assertEquals(true, actual.equals(expected));

	}
}
