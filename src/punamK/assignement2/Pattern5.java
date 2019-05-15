package punamK.assignement2;

public class Pattern5 {
	public static void main(String[] args){
	Pattern5 pattern5=new Pattern5();
	pattern5.call5(3);
	}
	void call5(int value){
		for(int i=1;i<=value;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j +" ");
			}System.out.println();
		}
		for(int k=value-1;k>0;k--){
			for(int l=1;l<=k;l++){
				System.out.print(l +" ");
			}
			System.out.println();
		}
	}

}
