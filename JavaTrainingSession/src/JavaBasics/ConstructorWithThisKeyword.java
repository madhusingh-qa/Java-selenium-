package JavaBasics;

public class ConstructorWithThisKeyword {
	//class variable
	String name;
	int age;
	
	public ConstructorWithThisKeyword(String name,int age) {
		
		this.name=name; // to make global v ariale to local variable
		this.age=age;
		
		System.out.println(name);
		System.out.println(age);
		
	}
	

	public static void main(String[] args) {
		
		ConstructorWithThisKeyword obj = new ConstructorWithThisKeyword("tom",30);
		
		
		

	}

}
