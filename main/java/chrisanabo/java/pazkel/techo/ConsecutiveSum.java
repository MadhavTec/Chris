package chrisanabo.java.pazkel.techo;

public class ConsecutiveSum {

	public static int consecutive(int num) {

		int sum = 0;
		int y = 1;
		int last = 1;
		int result = 0;

		for (int x = y; x < num; x++) {

			sum = sum + x;

			if (sum == num) {
				result++;
				sum = 0;
				last = y;
				y++;
				x = y - 1;

			} else if (sum > num) {

				sum = 0;
				last = y + 1;
				y++;
				x = y - 1;

			}

		}

		return result;

	}
}
