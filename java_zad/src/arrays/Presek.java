package arrays;
import java.util.*;

public class Presek {
	
	public static int[] nadjiPresek (Integer[] A, Integer[] B) {
		LinkedList<Integer> l1 = new LinkedList<Integer>(Arrays.asList(A));
		LinkedList<Integer> l2 = new LinkedList<Integer>(Arrays.asList(B));
		
		for (int i = 0; i<l1.size(); i++) {
			int j = 0;
			for (; j<l2.size();) {
				if (l1.get(i)==l2.get(j)) break;
				else j++;
			}
			if (j == l2.size()) {l1.remove(i);
			i--;}
		}
		
		int[] C = new int[l1.size()];
		for (int i = 0; i<l1.size(); i++) {
			C[i] = l1.get(i);
		}
		
		return C;
	}
	
	public static int faktorial(int b) {
		if (b == 1) return b;
		else return faktorial(b-2)*b;
		
	}
	
	public static void main(String[] args) {
		Integer[] A = {1,7,8,4};
		Integer[] B = {2,3,4,1,6,7};
		int[] C = nadjiPresek(A, B);
		for (int i = 0; i<C.length; i++) {
			System.out.println(C[i]);
		}
		
		int x = faktorial(7);
		System.out.println(x);
	}

}
