package JavaBasics;

public class B extends A {
	
	public B() {
		System.out.println("child class constructor");
	}
	
	public B(int i,int j) {
		super(i,j);
		System.out.println("this is child class double param");
		System.out.println("this is the value of i:"+i);
		System.out.println("this is the value of j:"+j);
			
		}
	
	public B(int i) {
		super(i);
		//System.out.println("this is single para of class B");
		//System.out.println("The value of i is :"+i);
	}
	
	public static void  main (String args[]) {
		
		B obj = new B ();
		B obj1 = new B (100,200);
		B obj2 = new B (40);
		
	}
	

}
