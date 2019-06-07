package punamK.coreJavaAssignement3;

public class Que5Book {
	String title;
	String bookPublisher;
	String author;

	Que5Book(String t, String bP, String a){

	this.title= t;
	this.bookPublisher= bP;
	this.author= a;
	}

	void display(){
	System.out.println("Title : "+title);
	System.out.println("Book Publisher : "+bookPublisher);
	System.out.println("Author : "+ author);
	}
	public static void main(String[] args) {
	Que5Book Q5 = new Que5Book("Test1", "HP","Punam");
	Q5.display();
	}

}
