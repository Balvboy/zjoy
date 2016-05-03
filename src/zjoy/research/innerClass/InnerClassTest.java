package zjoy.research.innerClass;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class InnerClassTest {
	
	static {
		
		String test2 = "abc";
		
	}

	public static void main(String[] args) throws UnsupportedEncodingException {
		
		String str = URLDecoder.decode("%B3%E4%D6%B5", "iso-8859-1");
		System.out.println(URLDecoder.decode(URLEncoder.encode(str,"iso8859-1"),"gbk"));
		System.out.println(URLDecoder.decode("%B3%E4%D6%B5", "iso-8859-1"));
		
		
		System.out.println(URLEncoder.encode("东方闪电", "iso8859-1"));
		System.out.println(URLDecoder.decode("东方闪电", "iso8859-1"));
		
		System.out.println(new String("东方闪电".getBytes("UTF-8"),"gbk"));
		
	}
}
