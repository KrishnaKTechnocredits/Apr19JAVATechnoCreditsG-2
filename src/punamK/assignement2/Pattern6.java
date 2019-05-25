package punamK.assignement2;

public class Pattern6 {
	public static void main(String[] args){
	Pattern6 pattern6=new Pattern6();
	pattern6.call6();
	}
	void call6(){
		int count=0;
		for(int i=1;i<=3;i++){
			for(int j=1;j<=3;j++){
				count=count+3;
				System.out.print(count +" ");
			}
			System.out.println();
		}
	}

}
