package chrisanabo.java.pazkel.techo;

public class InTheFuture {

	

	public static int minNum(int A, int K, int P) {
	
		
		double difference = K - A;
		
		if( difference <= 0.0){
			
			return -1;
		}
		
		double howMuchToCover = P / difference;
		
		return ((int)(howMuchToCover + 1.0 ));
	
	}

}
