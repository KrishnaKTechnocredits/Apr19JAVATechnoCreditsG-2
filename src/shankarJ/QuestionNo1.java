package shankarJ;
public class QuestionNo1 {
	//Find the missing number in integer array of 1 to 10?
	
 public static void main(String[] args) {

   int totalArray;
   int[] numbers = new int[]{1,2,3,4,6,7,8,9,10};
   totalArray = 10;
   int missingnum = (totalArray * (totalArray + 1) / 2);
   int sum = 0;
   for (int i: numbers) {
    sum += i;
   }
       System.out.print( missingnum - sum);
	   System.out.print("\n");
  }
 }
