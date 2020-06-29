package JavaBasics;

public class A {
	
	public A() {
		System.out.println("parent class constructor");
	}

	
	public A(int i,int j) {
		
		System.out.println("this is double param constructor of parent class");
		System.out.println(i);
		System.out.println(j);
		
	}
	
	
	public A(int i) {
		System.out.println("this is single para of parent class");
		System.out.println("the value of i is :"+i);
	}
}

