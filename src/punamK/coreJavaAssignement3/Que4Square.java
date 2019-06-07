package punamK.coreJavaAssignement3;

public class Que4Square {
	float side;

	Que4Square(float side){
	this.side= side;
	System.out.println("Value passed in Constructor  " + side);
	}
	void area(){
	double area =side * side;
	System.out.println("Area of Square = " +area);
	}

	}


