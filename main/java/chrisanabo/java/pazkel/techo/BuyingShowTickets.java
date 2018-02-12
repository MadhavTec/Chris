package chrisanabo.java.pazkel.techo;

public class BuyingTicket {

	static long waitingTime(int[] tickets, int p) {
		
		int jesseTicketCount = tickets[p];
		
		int oneLessJesseTicketCount = jesseTicketCount - 1;

		int waitingTime = 0;
		for (int pos = 0; pos < tickets.length; pos++) {
			
			int thisPositionsTicketCount = tickets[pos];
			if (pos <= p) {
				if (thisPositionsTicketCount > jesseTicketCount) {
					waitingTime += jesseTicketCount;
				} else {
					waitingTime += thisPositionsTicketCount;

				}
			} else {
				if (thisPositionsTicketCount > oneLessJesseTicketCount) {
					waitingTime += oneLessJesseTicketCount;
				} else {
					waitingTime += thisPositionsTicketCount;
				}
			}
		}

		return waitingTime;
	}

}
