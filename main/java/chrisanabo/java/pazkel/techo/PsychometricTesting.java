package chrisanabo.java.pazkel.techo;

public class PsychoMetric {
	
	static int[] jobOffers(int[] scores, int[] lowerLimits, int[] upperLimits){
		int[] offers = new int[lowerLimits.length];
		
		for(int i=0; i<offers.length;i++ ){
			int lowerLimit = lowerLimits[i];
			int upperLimit = upperLimits[i];
			int includedScoreCount = 0;
			for(int s=0;s<scores.length; s++){
				int thisScore = scores[s];
				if(thisScore<=upperLimit && thisScore>=lowerLimit){
					includedScoreCount++;
				}
			}
			offers[i]=includedScoreCount;

		}
		return offers;
		
	}
	

}
