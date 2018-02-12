package chrisanabo.java.pazkel.techo;

public class BalanceOrNot {

	static int[] balanceOrNot(String[] expressions, int[] maxReplacements) {

		int[] result = new int[expressions.length];

		int resultCount = 0;

		for (String expression : expressions) {

			int balance = 0;

			for (char chr : expression.toCharArray()) {

				if (chr == '<') {
					balance++;
				} else if (chr == '>') {
					balance--;
				}
			}

			if (Math.abs(balance) == maxReplacements[resultCount]) {
				result[resultCount] = 1;
			} else {
				result[resultCount] = 0;
			}

			resultCount++;

		}

		return result;
	}
}
