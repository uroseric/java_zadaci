package arrays;

import java.util.Arrays;
import java.util.HashMap;

public class DuplicateCharacters {
	
	public static char[] findDuplicateCharacters (String string) {
		char c[] = string.toCharArray();
		HashMap<Character, Integer> map = new HashMap<>();
		char temp[] = new char[string.length()];
		int l = 1;
		int j = 0;
		for (int i = 0; i<string.length(); i++) {
			if (map.containsKey(string.charAt(i))) {
				int k = map.get(string.charAt(i));
				map.put(string.charAt(i), ++k);
				if (k==2) {temp[j++] = string.charAt(i);}
			}

			else {
				map.put(string.charAt(i), 1);
			}
		}
		
		char res[] = new char[map.size()];
		res = Arrays.copyOf(temp, map.size());
		return res;
	}
	
	public static void main(String[] args) {
		String s = "jebo rmaterr j";
		
		System.out.println(findDuplicateCharacters(s));
	}

}
