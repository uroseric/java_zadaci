package arrays;

public class LongestPositiveSequence {
	
	public static void findLongestSequence (int[] niz) {
		int index = 0;
		int max = 0;
		
		for (int i = 0; i<niz.length; i++) {
			int k = 0;
			int ind = i;
			while(i<niz.length && niz[i]>0) {
				++k;
				i++;
			}
			if (k>max) {
				max = k;
				index = ind+1;
			}
		}
		System.out.println(max);
		System.out.println(index);
	}
	
	public static void main(String[] args) {
		int[] n = {1,2,3,4,5,6,7,8,-3,2,3,4,-6,1,2,3,4,5,-8,5,6,5,6,9,9,8};
		findLongestSequence(n);
		
	}

}
