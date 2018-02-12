package chrisanabo.java.pazkel.techo;

import junit.framework.TestCase;

public class BuyingTicketTest extends TestCase {

	

	public void testWaitingTimeTest1() {
		
		int[] tickets = {2,6,3,4,5};
		int p = 2;
		
	   long wt = BuyingTicket.waitingTime(tickets, p);
		
	   assertEquals(12, wt);
	   
	}

	public void testWaitingTimeTest2() {
		
		int[] tickets = {1,1,1,1};
		int p = 0;
		
	   long wt = BuyingTicket.waitingTime(tickets, p);
		
	   assertEquals(1, wt);
	   
	}

}
