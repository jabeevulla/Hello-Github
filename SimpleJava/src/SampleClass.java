
public class SampleClass {
	int var1=0;
/**
 * @param args
 */
public static void main(String[] args) {
	int[] ar=new int[3];
	System.out.println(ar);
	System.out.println();
	//upcasting
	Alphabit al=new A();
	al.printAl();
	//Downcasting
	A a=(A)al;
	a.print();
	
	
}
}
