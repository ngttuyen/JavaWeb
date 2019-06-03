package util;

public class StringUtil {
	public static String getString(Object s) {
		if(s==null) {
			return "";
		}else {
			return String.valueOf(s);
		}
	}
	public static String getString(String s) {
		if(s==null) {
			return "";
		}else {
			return s;
		}
	}
}
