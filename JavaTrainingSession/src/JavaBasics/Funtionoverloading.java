package JavaBasics;

public class Funtionoverloading {

	public static void main(String[] args) {
		
	
			
	Funtionoverloading f= new Funtionoverloading();
    f.sum(20, 'A');
	f.sum("hello","world");
	f.sum(30,"hi");
	sum();
		
	int sum	=f.sum(34, 70);
		System.out.println(sum);
	
	}

	public static void sum() {
		int a = 50;
		int b = 55;
		int c = a+b;
	
	}
	
	
	public int sum (int a,int b) {
	
		int sum = a+b;
		
		return sum;
		
		
	}
		
	public String sum(String x,String y) {
		
		String conce= x+y;
		System.out.println(conce);
		
		return conce;
		
 
		
	}
	
	
public void sum(int x,String y) {
		
		String conce= x+y;
		System.out.println(conce);
		
		//return conce;
   }

		public static void sum (int xy,char a){
			
		}
		
}
