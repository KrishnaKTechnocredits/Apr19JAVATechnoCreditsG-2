package shankarJ;

import java.util.Scanner;

public class Question10 {
	//10) WAP to character occurring in user defined String and Character
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String st = sc.nextLine();

		char ch[] = st.toCharArray();
		int n = ch.length;
		for (int i = 0; i < n;) {
			int count = 1;
			for (int j = i + 1; j < n; j++) {
				if (ch[i] == ch[j]) {
					count = count + 1;
					for (int k = j; k < n - 1; k++) {
						ch[k] = ch[k + 1];
					}
					j--;
					n--;
				}
			}
			System.out.println("char is : " + ch[0] + " " + "and number of occurrence =" + " " + count);
			sc.close();
			break;

		}

	}
}
