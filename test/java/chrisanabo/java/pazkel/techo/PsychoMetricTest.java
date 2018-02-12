package chrisanabo.java.pazkel.techo;
import java.util.Arrays;

import junit.framework.TestCase;



public class PsychoMetricTest  extends TestCase {

	
	public void testJobOfferTest1() {
		
			int[] scores = new int[]{1,3,5,6,8};
			int[] lowerLimits = new int[]{2}; 
			int[] upperLimits = new int[]{6};
		
			int[] actual = PsychoMetric.jobOffers(scores, lowerLimits, upperLimits);
			
			int[] expected = {3};
			
					
			assertEquals( true, Arrays.equals(actual,expected));
			
	}
	

	public void testJobOfferTest2() {
		
		int[] scores = new int[]{4,8,7};
		int[] lowerLimits = new int[]{2,4}; 
		int[] upperLimits = new int[]{8,4};
	
		int[] actual = PsychoMetric.jobOffers(scores, lowerLimits, upperLimits);
		
		int[] expected = {3,1};
		
	
		assertEquals( true, Arrays.equals(actual,expected));
		
}
}
