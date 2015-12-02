package arrays;

import java.util.Arrays;

public class ReverseString {

	public static String reverse (String string) {
		String s = string;
		StringBuilder res = new StringBuilder(s.length());
		
		for (int i = s.length()-1; i>=0; i--) {
			res.append(s.charAt(i));
		}
		return res.toString();
	}
	
	public static void main(String[] args) {
		String s = "je";
		String rev = reverse(s);
		System.out.println(rev);
		
		
	}
}
