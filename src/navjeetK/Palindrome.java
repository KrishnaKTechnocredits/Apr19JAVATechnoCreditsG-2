package navjeetK;

public class Palindrome {

	String temp = "";

	void reverse(String str) {

		for (int i = (str.length()) - 1; i >= 0; i--) {
			temp = temp + str.charAt(i);
		}

		if (str.equals(temp)) {
			System.out.println("String is palindrome : " + str + " : " + temp);
		} else
			System.out.println("String is not palindrome : " + str + " : " + temp);
	}

	public static void main(String[] args) {
		Palindrome p1 = new Palindrome();

		p1.reverse("racecar");
	}

}
