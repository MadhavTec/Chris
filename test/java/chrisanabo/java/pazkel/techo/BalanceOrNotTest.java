package chrisanabo.java.pazkel.techo;

import java.util.Arrays;

import junit.framework.TestCase;

public class BalanceOrNotTest extends TestCase {

	public void testBalanceOrNotTest1(){
		
		String[] expressions = new String[] { "<>>>", "<>>>>" };
		
		int[] maxReplacements = {2,2};
		int[] actual = BalanceOrNot.balanceOrNot(expressions, maxReplacements);
		int[] expected = {1,0};
		 
	   assertEquals(Arrays.equals(actual, expected ), true);
		
	}

}
