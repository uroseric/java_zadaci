package arrays;

//[stack] Napisi implementaciju Steka (push i pop metode) i da bude genericka klasa.

public class Stack<T> {
	
	T[] niz = (T[])new Object[10];
	private int n = niz.length;
	private int p = 0;

	public void push(T t) {
		niz[p] = t;
		p++;
			
		if (p==niz.length-1) {
			T[] niz2 = (T[])new Object[niz.length+n];
			for (int i = 0; i<niz.length; i++) {
				niz2[i] = niz[i];
			}
			niz = niz2;
		}
	}
	
	public T pop() {
		if (p==0) {
			return null;
		}
		
		T r = niz[p-1];
		niz[p-1] = null;
		p--;
		return r;
	}
	
	public boolean isEmpty () {
		if (p==0) return true;
		else return false;
	}

}
