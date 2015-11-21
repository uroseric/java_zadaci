package Strings;
import java.util.*;


//2. Write a method to replace all spaces in a string with ‘%20’.
public class ReplaceSpaces {
	
	public static String replaceSpaces(String s) {
		
		int n = s.length();
		StringBuilder b = new StringBuilder(s.length());
		
		for (int i = 0; i<n; i++) {
			if (s.charAt(i) == ' ') {
				b.append("%20");
			}
			else {
				b.append(s.charAt(i));
			}
		}
		
		return b.toString();
	}

	 public static void main(String args[]) {
		 String s1 = " blab lccc i";
		 String exp1 = "%20blab%20lccc%20i";
		 String s2 = "";
		 String exp2 = "";
		 String s3 = "bravo x";
		 String exp3 = "bravo%20x";
		 String s4 = "bba r  s";
		 String exp4 = "bba%20r%20%20s";
		 String s5 = "bbarsss";
		 String exp5 = "bbarsss";
		 
		 check(exp1, replaceSpaces(s1));
		 check(exp2, replaceSpaces(s2));
		 check(exp3, replaceSpaces(s3));
		 check(exp4, replaceSpaces(s4));
		 check(exp5, replaceSpaces(s5));
		 
	 }
		 
		 

	 private static void check (String expected, String actual) {
		 if (expected.equals(actual)) {
			 System.out.println("ok");
		 }
		 else {
			 System.out.println("nije ok");
			 System.out.println("expected: " + expected);
			 System.out.println("actual: " + actual);
		 }
	 }


}
