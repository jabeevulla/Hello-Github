
public class A extends Alphabit{
	A(){
		super();
		System.out.println("Cunstructor A");
		
	}
	public void printAl(){
		System.out.println("A--> printAl()");
	}
	public void print(){
		System.out.println("A--> print()");
		printAl();
	}
}
