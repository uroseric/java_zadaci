package strings;

//Napisi funkciju 'rotate' koja prima niz karaktera i vraca niz sa obrnutim redosledom

public class RotateCharArray {
	
	public static char[] rotate (char[] niz) {
		int n = niz.length;
		for (int i = 0; i<n/2; i++) {
			char t = niz[i];
			niz[i] = niz[n-1-i];
			niz[n-1-i] = t;
		}
		
		return niz;
	}
	
	
	public static void main(String args[]) {
		 char[] n1 = {'b','l','a','b','l','c','d','c','i'};
		 char[] exp1 = {'i','c','d','c','l','b','a','l','b'};
		 char[] n2 = {'b','l','a','d','c','i'};
		 char[] exp2 = {'i','c','d','a','l','b'};
		 char[] n3 = {};
		 char[] exp3 = {};
		 char[] n4 = {'b','l','a'};
		 char[] exp4 = {'a','l','b'};
		 char[] n5 = {'a','b','c','d'};
		 char[] exp5 = {'d','c','b','a'};
		 
		 check(exp1, rotate(n1));
		 check(exp2, rotate(n2));
		 check(exp3, rotate(n3));
		 check(exp4, rotate(n4));
		 check(exp5, rotate(n5));
	}
	
	
	private static void check (char[] expected, char[] actual) {
		boolean ok = true;
		
		if (expected.length!=actual.length) {
			System.out.println("nije ok");
		}
		
		else {
			for (int i = 0; i<expected.length; i++) {
				if (expected[i]!=actual[i]) ok = false;
			}
			
			if (ok) System.out.println("ok");
			else System.out.println("nije ok");
		}
		 
	 }

}
