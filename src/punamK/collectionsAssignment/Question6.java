
package punamK.collectionsAssignment;

import java.util.HashMap;
import java.util.Set;

public class Question6 {
	public static void main(String[] args) {
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		boolean flag = false;
		int value = 0;
		String str1 = "GBGBGR";
		System.out.println(str1);
		char[] array1 = str1.toCharArray();
		if (array1.length % 2 == 0 && array1.length != 0) {
			for (int i = 0; i < array1.length; i++) {
				if (hm.containsKey(array1[i])) {
					value = hm.get(array1[i]);
					value = value + 1;
					hm.put(array1[i], value);
				} else {
					hm.put(array1[i], 1);
				}
			}
			System.out.println(hm);
			Set<Character> s = hm.keySet();
			for (char ch : s) {
				value = hm.get(ch);
				if (value % 2 == 0) {
					System.out.println("True");
				} else {
					System.out.println("False");

				}
			}

		} else {
			System.out.println("False");
		}

	}

}