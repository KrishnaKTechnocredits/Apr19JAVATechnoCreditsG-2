package shankarJ;
//using third variable
public class SwapNumbers3rd {

	public static void main(String[] args) {

		SwapNumbers3rd sn = new SwapNumbers3rd();
		float first, second;
		first = 67.5f;
		second = 37.9f;
		System.out.println(sn);

		System.out.println("--Before swap--");
		System.out.println("First number = " + first);
		System.out.println("Second number = " + second);

		float third;
		third = first;
		first = second;
		second = third;

		System.out.println("--After swap--");
		System.out.println("First number = " + first);
		System.out.println("Second number = " + second);
	}

}