package chrisanabo.java.pazkel.techo;

import junit.framework.TestCase;

public class LargeResponseTest extends TestCase {

	public void testfindTheLargest() {
		String[] fileContent = new String[] {

				"unicomp6.unicomp.net ‐ ‐ [01/Jul/1995:00:00:06 ‐0400] \"GET /shuttle/countdown/ HTTP/1.0\" 200 3985",
				"burger.letters.com ‐ ‐ [01/Jul/1995:00:00:11 ‐0400] \"GET /shuttle/countdown/liftoff.html HTTP/1.0\" 304 0",
				"burger.letters.com ‐ ‐ [01/Jul/1995:00:00:12 ‐0400] \"GET /images/NASA‐logosmall.gif HTTP/1.0\" 304 0",
				"burger.letters.com ‐ ‐ [01/Jul/1995:00:00:12 ‐0400] \"GET /shuttle/countdown/video/livevideo.gif HTTP/1.0\" 200 0",
				"d104.aa.net ‐ ‐ [01/Jul/1995:00:00:13 ‐0400] \"GET /shuttle/countdown/ HTTP/1.0\" 200 3985",
				"unicomp6.unicomp.net ‐ ‐ [01/Jul/1995:00:00:14 ‐0400] \"GET /shuttle/countdown/count.gif HTTP/1.0\" 200 40310",
				"unicomp6.unicomp.net ‐ ‐ [01/Jul/1995:00:00:14 ‐0400] \"GET /images/NASA‐logosmall.gif HTTP/1.0\" 200 786",
				"unicomp6.unicomp.net ‐ ‐ [01/Jul/1995:00:00:14 ‐0400] \"GET /images/KSC‐logosmall.gif HTTP/1.0\" 200 1204",
				"d104.aa.net ‐ ‐ [01/Jul/1995:00:00:15 ‐0400] \"GET /shuttle/countdown/count.gif HTTP/1.0\" 200 40310",
				"d104.aa.net ‐ ‐ [01/Jul/1995:00:00:15 ‐0400] \"GET /images/NASA‐logosmall.gif HTTP/1.0\" 200 786"

		};
		int byteSizeThreshold = 5000;
	
		
		String fileName = "hosts_access_log_00.txt";
		
		String actual = LargeResponse.findTheLargest(fileContent, byteSizeThreshold, fileName);
		
		String expected = "80620_hosts_access_log_00.txt";

		
		assertEquals(true, actual.equals(expected));
		
		
	}
}
