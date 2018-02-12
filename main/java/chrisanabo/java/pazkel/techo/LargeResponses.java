package chrisanabo.java.pazkel.techo;

public class LargeResponse {

	
	static String findTheLargest( String[] fileContent, int byteSizeThreshold, String fileName) {
		
		String result = null;
		
				int count  = 0;
				int bytes = 0;
				
				for (int i = 0; i < fileContent.length; i++) {
					String[] line  =  fileContent[i].split( " ");
					int byteSize = Integer.parseInt( line[ line.length - 1]);
					
					if ( byteSize > byteSizeThreshold ) {
						count ++;
						bytes += byteSize;
					}
					
				}
	
		
		    result = bytes + "_" + fileName;
		
		    return result;
	}
	
}
