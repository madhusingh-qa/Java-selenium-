package JavaBasics;

public class Function {

	public static void main(String[] args) {
		
		Function obj=new Function();
		obj.pqr();
		obj.test();
		int div = obj.divison(50,25);
		System.out.println(div);
		
	}

	
	public void test() {
		
		System.out.println("test method");
	}
	
	public int pqr() {
	
		System.out.println("pqr");
		int a=10;
		int b = 20;
		int c = a+b;
		return c;
		
	}
	
	public int divison(int x,int y) {
		
		System.out.println("division method");
		
		int d = x/y;
		
		return d;
	}
	
}
