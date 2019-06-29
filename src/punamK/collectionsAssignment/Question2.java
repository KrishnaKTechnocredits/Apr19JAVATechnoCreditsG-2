package punamK.collectionsAssignment;

import java.util.ArrayList;

public class Question2 {
	public static void main(String[] args) {
		int[] array1 = { 11, 20, 3, 4, 5, 6 };
		ArrayList<Integer> al = new ArrayList<Integer>();

		for (int i = 0; i < array1.length; i++) {
			al.add(array1[i]);
		}
		System.out.println(al);
		int a1 = al.get(0) + al.get(al.size() - 1);
		int a2 = al.get(1) + al.get(al.size() - 2);
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		al1.add(a1);
		al1.add(a2);
		System.out.println(al1);
	}

}