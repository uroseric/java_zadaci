package arrays;

public class Stack2<Integer> {
	
	int[] niz = new int[10];
	int[] nizMin = new int[10];
	private int n = niz.length;
	private int p = 0;
	private int m = 0;

	public void push(int a) {
		niz[p] = a;
		nizMin[0] = niz[0];
		if (niz[p]<nizMin[m]) {
			nizMin[++m]=niz[p];
		}
		p++;
			
		if (p==niz.length-1) {
			int[] niz2 = new int[niz.length+n];
			for (int i = 0; i<niz.length; i++) {
				niz2[i] = niz[i];
			}
			niz = niz2;
		}
	}
	
	public int pop() {
		if (p==0) {
			return -1;
		}
		
		int r = niz[p-1];
		niz[p-1] = -1;
		p--;
		if (r==nizMin[m]) {
			m--;
		}
		return r;
	}
	
	public int getMin() {
		return nizMin[m];
	}
}
