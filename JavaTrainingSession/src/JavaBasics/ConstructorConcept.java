package JavaBasics;

public class ConstructorConcept {
	
	public ConstructorConcept() {
		System.out.println("this is default constructor");
	}

	
	public ConstructorConcept(int i) {
		System.out.println("this is param 1 constructor");
		System.out.println("the value of i"+i);
		
	}
	
	public ConstructorConcept(int i,int j) {
		System.out.println("this is two param constructor");
        System.out.println("the value of i is "+i);
        System.out.println("the value of j is :"+j);
	}
	
	public static void main(String[] args) {
		ConstructorConcept obj = new ConstructorConcept();
		ConstructorConcept obj1 = new ConstructorConcept(10);
		ConstructorConcept obj2 = new ConstructorConcept(10,20);
		

	}

}
