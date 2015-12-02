package arrays;

public class ReverseInt {

	public static int reverse (int broj) {
		int b = broj;
		int res = 0;
		int k = 0;
		while (b!=0) {
			k++;
			b = b/10;
		}
		b = broj;
		
		for (int i = k-1; i>=0; i--) {
			res += (b%10) * Math.pow(10, i);
			b = b/10;
		}
		return res;
	}
	
	public static void main(String[] args) {
		int b = 1234567;
		
		System.out.println(reverse(b));
	}
}
