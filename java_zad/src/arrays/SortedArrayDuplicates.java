package arrays;

import java.util.*;


public class SortedArrayDuplicates {
	
	
	public static int[] removeDuplicates (int[] niz) {
		//ArrayList<Integer> list = new ArrayList<>(arrays.asList(niz));
		//ArrayList<Integer> list = new arrays.asList(niz);
		//LinkedList<Integer> list = new LinkedList<>(arrays.asList(niz));
		int j = 0;
		int i = 1;
	 
		while (i < niz.length) {
			if (niz[i] == niz[j]) {
				i++;
			} else {
				j++;
				niz[j] = niz[i];
				i++;
			}
		}
	 
		int[] novi = Arrays.copyOf(niz, j + 1);
	 
		return novi;
	}
	
	public static void main(String[] args) {
		int[] n = {1,1,2,3,3,4,5,5};
		int[] novi = removeDuplicates(n);
		for (int i = 0; i<novi.length; i++) {
			System.out.println(novi[i]);
		}
	}

}
