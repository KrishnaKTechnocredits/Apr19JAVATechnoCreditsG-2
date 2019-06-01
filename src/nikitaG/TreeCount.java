package nikitaG;

import java.util.Scanner;

public class TreeCount {

	int getVisibleTreeCount(int[] treesArray){
		int maxHeight = treesArray[0];
		int visibletrees = 1;
		for(int i = 1; i <treesArray.length;i++ )
		{
			if(maxHeight < treesArray[i])
			{
				maxHeight = treesArray[i];
				visibletrees++;
			}
		}
		return visibletrees;
	}

	void displayTreeDetails(int[] treesArray){
		int maxHeight = treesArray[0];
		int visibletrees = 1;
		String visibletreesString = "";
		for(int i = 1; i <treesArray.length;i++ )
		{
			if(maxHeight < treesArray[i])
			{
				maxHeight = treesArray[i];
				visibletrees++;
			}
		}
		System.out.println("Total no of Visible trees are : "+visibletrees);
		System.out.println("Max height among visible trees is : "+maxHeight);
		System.out.println("Max height among visible trees is : "+maxHeight);
	}
	
	int[] readValues1(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the tree heights:");
		String[] lineArr = sc.nextLine().split(" ");
		int[] data = new int[lineArr.length];
		for(int i =0; i<data.length;i++)
			data[i] = Integer.parseInt(lineArr[i]); 
		sc.close();
		return data;
	}
	
	public static void main(String[] args) {
		TreeCount treeCount = new TreeCount();
		System.out.println("Total no of Visible trees are : "+treeCount.getVisibleTreeCount(treeCount.readValues1()));
	}
}
