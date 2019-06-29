package punamK.collectionsAssignment;

import java.util.HashMap;
import java.util.Set;

public class Question1 {
	String name;
	int rnum;
	String city;

	Question1(String name, int rnum, String city) {
		this.name = name;
		this.rnum = rnum;
		this.city = city;
		// System.out.println(name+ " "+rnum+" "+city);
	}

	public String toString() {
		return this.name + " " + this.rnum + " " + this.city;

	}

	public static void main(String[] args) {
		Question1 s1 = new Question1("Punam", 10, "Pune");
		Question1 s2 = new Question1("Swara", 20, "Mumbai");
		Question1 s3 = new Question1("Karishma", 30, "Delhi");

		HashMap<String, Question1> hm = new HashMap<String, Question1>();
		hm.put("Punam", s1);
		hm.put("Swara", s2);
		hm.put("Karishma", s3);

		Set<String> s = hm.keySet();
		for (String sname : s) {
			// System.out.println(sname + " : "+ hm.get(sname));
			// if(hm.containsKey("Punam"))
			if (sname.equals("Punam")) {
				System.out.println(hm.get(sname));
			}
		}
	}

}