package nikitaG;

public class FindNegativeNo {

	static String findNegNo(int[] numArr){
		String negStr = "";
		int start = 0;
		for(int j = 0; j<numArr.length ;j++){
			if(numArr[j]<0){
				negStr = negStr + numArr[j]+ " ";
				start++;
			}
		}
		return negStr;
	}
	
	public static void main(String[] args) {
		ScannerEx5 se5 = new ScannerEx5();
		System.out.println("Negative numbers are "+findNegNo(se5.readValues1()));
	}
}
