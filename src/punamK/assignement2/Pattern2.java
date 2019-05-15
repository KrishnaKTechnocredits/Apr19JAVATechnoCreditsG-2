package punamK.assignement2;

public class Pattern2 {
	public static void main(String[] args){
	Pattern2 pattern2=new Pattern2();
	pattern2.call2(4);
	}
	void call2(int value){
		for(int i=1;i<=value;i++){
			for(int j=1;j<=value;j++){
				if((i%2!=0 && j%2!=0) ||(i%2==0 && j%2==0)){
					System.out.print("# ");
					}else {
					System.out.print("* ");
				}
			}System.out.println();
		}
	}

}

