package punamK.collectionsAssignment;

import java.util.ArrayList;
import java.util.Collections;

public class Question5 {
	public static void main(String[] args) {
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		ArrayList<Integer> al2 = new ArrayList<Integer>();

		int[] array1 = { 12, 100, 5, 10, 34, 17, 84 };
		for (int i = 0; i < array1.length; i++) {
			System.out.print(array1[i] + " ");

			if (i % 2 == 0) {
				al1.add(array1[i]);
			} else {
				al2.add(array1[i]);
			}
		}
		System.out.println();
		Collections.sort(al1);
		System.out.println(al1);
		Collections.sort(al2);
		System.out.println(al2);
		Collections.reverse(al2);
		System.out.println(al2);
	}

}
