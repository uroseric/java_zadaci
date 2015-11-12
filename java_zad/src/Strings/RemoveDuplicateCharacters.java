package Strings;

import java.awt.List;
import java.util.*;

//1. Design an algorithm and write code to remove the duplicate characters in a string
//without using any additional buffer.
//NOTE: One or two additional variables are fine. An extra copy of the array is not.

public class RemoveDuplicateCharacters {

	public static String removeDuplicates(String s) {
		int n = s.length();
		int k = n;
		char[] c = s.toCharArray();
		
		for (int i = 0; i<n-1; i++) {
			for (int j = i+1; j<n; j++) {
				if (c[i]==c[j]) {
					for (int p = j; p<k-1; p++) {
						char t = c[p];
						c[p] = c[p+1];
						c[p+1] = t;
					}
					n--;
					j--;
				}
			}
		}
		
		StringBuilder b = new StringBuilder();
		for (int i = 0; i<n; i++) {
			b.append(c[i]);
		}
		
		return b.toString();
	}
	
	public static String removeDuplicates2(String s) {
		int n = s.length();
		char[] c = s.toCharArray();
		int p = 0;
		for (int i = 0; i<n; i++) {
			boolean found = false;
			for (int j = 0; j<i; j++) {
				if (c[i]==c[j]) {
					found = true;
					break;
				}
			}
			if (!found) c[p++] = c[i];
		}
		
		StringBuilder b = new StringBuilder();
		for (int i = 0; i<p; i++) {
			b.append(c[i]);
		}
		
		return b.toString();
	}
	
	
	 public static void main(String args[]) {
		 String s1 = "blab lccc i";
		 String exp1 = "bla ci";
		 String s2 = "";
		 String exp2 = "";
		 String s3 = "bravo x";
		 String exp3 = "bravo x";
		 String s4 = "bba r s";
		 String exp4 = "ba rs";
		 String s5 = "bba r sss";
		 String exp5 = "ba rs";
		 
		 check(exp2, removeDuplicates2(s2));
		 check(exp2, removeDuplicates(s2));
		 
	 }
		 
		 

	 private static void check (String expected, String actual) {
		 if (expected.equals(actual)) {
			 System.out.println("ok");
		 }
		 else {
			 System.out.println("nije ok");
		 }
	 }
	 
	 
	 
}
