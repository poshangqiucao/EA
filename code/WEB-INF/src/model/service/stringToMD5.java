package SystemCoding.model.service;
import java.security.MessageDigest;

/**
 * @author cheng
 * @version 1.0
 * @created 01-12��-2019 19:24:45
 */
public class stringToMD5 {

	private static final String slat = "&%5123***&&%%$$#@";
	
	public stringToMD5(){

	}

	public void finalize() throws Throwable {

	}
	/**
	 * 
	 * @param str
	 */
	public static String toMD5(String dataStr){
		try {
			dataStr = dataStr + slat;
			MessageDigest m = MessageDigest.getInstance("MD5");
			m.update(dataStr.getBytes("UTF8"));
			byte s[] = m.digest();
			String result = "";
			for (int i = 0; i < s.length; i++) {
				result += Integer.toHexString((0x000000FF & s[i]) | 0xFFFFFF00).substring(6);
			}
			return result;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return "";
	}

	 
	public static boolean isNumeric(String str){
		for (int i = str.length();--i>=0;){
			if (!Character.isDigit(str.charAt(i))){
				return false;
			}
		}
		return true;
	}
	
}//end stringToMD5