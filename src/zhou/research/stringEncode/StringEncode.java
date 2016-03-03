package zhou.research.stringEncode;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.security.AccessController;


public class StringEncode {

	public static void main(String[] args) throws UnsupportedEncodingException {
		
			
		String entName = "()（）大大".replace("(", "").replace(")", "").replace("（", "").replace("）", "");
		System.out.println(entName);
		
		
		
		
		
		
	}
}
