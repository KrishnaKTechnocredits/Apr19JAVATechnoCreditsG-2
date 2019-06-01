package nikitaG;

public class Assignments {

	public void pattern1(int count)
	{
		for (int i = 1; i <= count; i++) {
			for (int j = 1; j <= i; j++) {
					System.out.print(j);
			}
			System.out.println();
		}
	}
	
	public void pattern2(int count)
	{
		for (int i = 1; i <= count; i++) {
			for (int j = count; j >= 1; j--) {
				if(j>i)	
					System.out.print("1");
				else 
					System.out.print(i);
			}
			System.out.println();
		}
	}
	
	public void pattern3(int count)
	{
		for (int i = 1; i <= count; i++) {
			for (int j = 1; j <= i; j++) {
					System.out.print(j);
			}
			System.out.println();
		}
		for (int i = 1; i <= count; i++) {
			for (int j = 1; j <= count-i; j++) {
					System.out.print(j);
			}
			System.out.println();
		}
	}
	
	public void pattern4(int count)
	{
		for (int i = 1; i <= count; i++) {
			for (int j = 1; j <= count+1-i; j++) {
					System.out.print(j+" ");
			}
			System.out.println();
		}
		for (int i = 1; i <= count-1; i++) {
			for (int j = 1; j <= i+1; j++) {
					System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	
	public void pattern5(int count)
	{
		for (int i = 1; i <= count; i++) {
			for (int j = count; j >= i ; j--) {
					System.out.print(j);
			}
			System.out.println();
		}
	}
	
	public void pattern6(int count)
	{
		for (int i = 1; i <= count; i++) {
			for (int j = 1; j <= count+1-i ; j++) {
					System.out.print(j);
			}
			System.out.println();
		}
	}
	
	public void pattern7(int count)
	{
		for (int i = 1; i <= count; i++) {
			for (int j = count; j > count-i ; j--) {
					System.out.print(j);
			}
			System.out.println();
		}
	}
	
	public void pattern8(int count)
	{
		for (int i = 1; i <= count; i++) {
			for (int j = 1; j <= i*2-1 ; j++) {
				if(j<=i)
					System.out.print(j);
				else 
					System.out.print(i*2-j);
			}
			System.out.println();
		}
	}
	
	public void pattern9(int count)
	{
		for (int i = 1; i <= count; i++) {
			for (int j = 1; j <= count ; j++) {
				if(j<i)
					System.out.print(" ");
				else 
					System.out.print(j);
			}
			System.out.println();
		}
		
		for (int i = 1; i <= count-1; i++) {
			for (int j = 1; j <= count ; j++) {
				if(j<count-i)
					System.out.print(" ");
				else 
					System.out.print(j);
			}
			System.out.println();
		}
	}
	
	public void pattern10(int count)
	{
		for (int i = 1; i <= count; i++) {
			for (int j = 1; j <= count ; j++) {
				if(j<i)
					System.out.print(" ");
				else 
					System.out.print(j);
			}
			System.out.println();
		}
		
		for (int i = 1; i <= count-1; i++) {
			for (int j = 1; j <= count ; j++) {
				if(j<count-i)
					System.out.print(" ");
				else 
					System.out.print(j);
			}
			System.out.println();
		}
	}
	
	public void pattern11(int count)
	{
		for (int i = 1; i <= count; i++) {
			for (int j = 1; j <= i ; j++) {
				if(j%2==1)
					System.out.print("1");
				else 
					System.out.print("0");
			}
			System.out.println();
		}
	}
	
	public void pattern12(int count)
	{
		for (int i = 1; i <= count; i++) {
			for (int j = count; j >= 1 ; j--) {
				if(j<=i)
					System.out.print(" "+i);
				else 
					System.out.print(" ");
			}
			System.out.println();
		}
	} 
	
	public void pattern13(int count)
	{
		for (int i = 1; i <= count; i++) {
			int num=1;
			for (int j = count; j >= 1 ; j--) {
				if(j <= i)
					System.out.print(num++ +" ");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	} 
	
	public void pattern14(int count)
	{
		for (int i = 1; i <= count; i++) {
			for (int j = count; j >= 1 ; j--) {
				if(j<=i)
					System.out.print("*"+" ");
				else 
					System.out.print(" ");
			}
			System.out.println();
		}
	} 
	
	public void trickyPattern1(int count)
	{
		for (int i = 1; i <= count; i++) {
			int num=0;
			int temp=count*2-1;
			for (int j = count; temp>0 ; j--) {
				if(j>i && temp>=count)
					System.out.print(" ");
				else if(j<=i && temp>=count)
					System.out.print(++num);
				else if(i>1 && temp<count && num>1)
					System.out.print(--num);
				temp--;
			}
			System.out.println();
		}
	} 
	
	
	public void trickyPattern2(int count)
	{
		for (int i = 1; i <= count; i++) {
			int num=0;
			int temp=count*2-1;
			for (int j = 1; temp>0 ; j++) {
				if(j<i)
					System.out.print(" ");
				else if(j>=i && temp>=count)
					System.out.print(++num);
				else if(num>1)
					System.out.print(--num);
				temp--;
			}
			System.out.println();
		}
	}
	
	public void trickyPattern3(int count)
	{
		for (int i = 1; i <= count; i++) {
			int num=0, num1=0;
			int temp=count*2-1;
			for (int j = 1; temp>0 ; j++) {
				if(j<count+1-i)
				{
					System.out.print(" ");
					num++;
				}
				else if(j==count+1-i && temp>=count)
				{
					System.out.print(++num);
					num1=num;
				}
				else if(j>count+1-i && temp>=count)
				{
					System.out.print(++num);
				}
				else if(temp<count && num<num1)
					System.out.print(" ");
				else if(temp<count && num!=num1)
					System.out.print(--num);
				temp--;
			}
			System.out.println();
		}
	}
	
	public void trickyPattern4(int count)
	{
		for (int i = 1; i <= count; i++) {
			int num=4;
			int temp=i;
			for (int j = 1; j <= i ; j++) {
				if(j==1)
					System.out.print(i+"\t");
				else 
				{
					temp=temp+num;
					System.out.print(temp+"\t");
					num--;
				}
			}
			System.out.println();
		}
	} 
	
	public void trickyPattern5(int count)
	{
		for (int i = 1; i <= count; i++) {
			for (int j = 1; j <= count ; j++) {
				if(i%2!=0 && i*j%2!=0)
				{
					System.out.print("1");
				}
				else if(i%2!=0 && i*j%2==0)
				{
					System.out.print("0");
				}
				else if(i%2==0 && j%2!=0)
				{
					System.out.print("0");
				}
				else
				{
					System.out.print("1");
				}
			}
			System.out.println();
		}
	}
	
	
	public static void main(String[] args) {
		Assignments pp1 = new Assignments();
		pp1.trickyPattern3(7);
	}
}
