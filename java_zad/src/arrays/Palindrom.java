package arrays;

import java.util.ArrayList;

public class Palindrom {

	public static boolean isPalindrom (int broj) {
		boolean palindrom = true;
		int b = broj;
		//int niz[] = null;
		ArrayList<Integer> niz = new ArrayList<>();
		int n = 0;
		
		while (b!=0) {
			int k = b%10;
			niz.add(k);
			n++;
			b = b/10;
		}
		
		for (int i = 0, j = niz.size()-1; i<niz.size()/2; i++, j--) {
			if (niz.get(i)!=niz.get(j)) palindrom = false;
			break;
		}
		
		return palindrom;
	}
	
	public static void main(String[] args) {
		int b = 12321;
		
		if (isPalindrom(b)) {
			System.out.println("jeste palindrom");
		}
		else {System.out.println("nije palindrom");}
	}
}
