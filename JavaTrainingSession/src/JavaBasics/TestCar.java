package JavaBasics;

public class TestCar {

	public static void main(String[] args) {
		BMW b= new BMW();
		
		b.start();
		
		b.refule();
		
		b.threftsafety();
		b.engine();

		
		Car c = new Car();
		
		c.start();
		
		c.stop();
		
		
		System.out.println("******");
	Car c1	= new BMW(); //  Top casting // dynamic or run time  polymorphism -- child class obj can be refered by parent class reference variable 
	// down casting will give run time error
	c1.refule();
	c1.start();
	
	//t
	}

	
}
