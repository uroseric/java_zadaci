package arrays;

public class AritmetickaSredina {
	
	public static double Prosek (double niz[]) {
		double prosek = 0;
		double zbir = 0;
		//n[] 
		
		for (int i = 0; i<niz.length; i++) {
			zbir += niz[i];
		}
		prosek = zbir/(niz.length);
		return prosek;
	}
	
	public static void main(String[] args) {
//		double niz[] = {1, 2, 2, 6};
		double niz[] = {};
		
		System.out.println(Prosek(niz));
	}
	
}
