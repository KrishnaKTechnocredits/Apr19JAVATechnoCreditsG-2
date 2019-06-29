package punamK.collectionsAssignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Question8 {
	public static void main(String[] args) {
		HashMap<String, Integer> hm1 = new HashMap<String, Integer>();
		HashMap<String, Integer> hm2 = new HashMap<String, Integer>();
		boolean flag = false;
		hm1.put("Punam", 1);
		hm1.put("Humu", 2);
		hm1.put("Sri", 3);
		hm1.put("Nats", 4);

		hm2.put("Punam", 1);
		hm2.put("Humu", 2);
		hm2.put("Sri", 3);
		hm2.put("Nats", 4);
		// hm2.put("Anks", 4);
		//
		// System.out.println();
		// if (hm1.size() == hm2.size()) {
		// if(hm1.equals(hm2)){
		// System.out.println("True");
		// }else{
		// System.out.println("False");
		// }
		// }
		// else {
		// System.out.println("HashMaps are different");
		// }

		// Another way of matching keys of HahMaps

		System.out.println(hm1.keySet().equals(hm2.keySet()));

		// comparing values

		System.out.println(new HashSet<Integer>(hm1.values()).equals(new HashSet<Integer>(hm2.values())));

	}

}