package chrisanabo.java.pazkel.techo;

public class FindTheWinner {

	public static String winner(int[] andrea, int[] maria, String s) {

		int modValue = (s.equalsIgnoreCase("oDd")) ? 1 : 0;
		int andreaScore = 0;
		int mariaScore = 0;
		String result = "Tie";

		for (int i = 0; i < andrea.length; i++) {

			if (i % 2 == modValue) {

				if (andrea[i] > maria[i]) {
					andreaScore++;

				} else if (andrea[i] < maria[i]) {
					mariaScore++;
				}
			}

		}

		if (andreaScore > mariaScore) {
			result = "Andrea";
		} else if (andreaScore < mariaScore) {
			result = "Maria";
		}

		return result;
	}

}
