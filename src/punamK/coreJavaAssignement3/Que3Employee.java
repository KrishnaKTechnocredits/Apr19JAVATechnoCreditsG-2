package punamK.coreJavaAssignement3;

import java.util.Scanner;

public class Que3Employee {
int empid;
String ename;
float sal;
Scanner sc = new Scanner(System.in);
Que3Employee(){
System.out.println("Enter empid");
empid = sc.nextInt();
System.out.println("Enter ename");
ename = sc.next();
System.out.println("enter sal");
sal = sc.nextFloat();

}
void displayEmployee(){
System.out.println(empid + " " + ename+" " + sal);
}

}