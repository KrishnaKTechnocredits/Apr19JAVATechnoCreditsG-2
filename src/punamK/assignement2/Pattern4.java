package punamK.assignement2;

public class Pattern4 {
	public static void main(String[] args){
	Pattern4 pattern4=new Pattern4();
	pattern4.call4(4);
	}
	void call4(int value){
		for(int i=1;i<=value;i++){
			for(int j=1;j<=value;j++){
				if((i%2==0 && j%2==0) || (i%2!=0 && j%2!=0))
				System.out.print(j+" ");
				else
					System.out.print("* ");
			}System.out.println();
		}
	}

}
