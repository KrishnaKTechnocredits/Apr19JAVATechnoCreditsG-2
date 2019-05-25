package punamK.assignement2;

public class Pattern1 {
	public static void main(String [] args){
	Pattern1 pattern1=new Pattern1();
	pattern1.call1(4);
	}
	void call1(int value){
		for(int i=1;i<=value; i++){
			for(int j=1;j<=i;j++){
				if(i%2!=0)
				System.out.print("* ");
				else
					System.out.print("# ");
			}
			System.out.println();
		}
	}

}
