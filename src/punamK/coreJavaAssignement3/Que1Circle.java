package punamK.coreJavaAssignement3;

public class Que1Circle {
float r;
Que1Circle(){
r =10;

}
void areaOfCircle(){
double area = 3.14 * r * r;
System.out.println("Area of Circle : "+area);
}

void circumference(){
double circumference= 2* 3.14 * r;
System.out.println("Circumference of Circle : "+circumference);
}

}