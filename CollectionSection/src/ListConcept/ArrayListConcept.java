package ListConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static void main(String[] args) {
		ArrayList arr=new ArrayList();//non generic arraylisy
		
		ArrayList<Integer> ar = new ArrayList<Integer>();//generic 
		ar.add(800);
		
		
		
		arr.add(200);
		arr.add(40);
		arr.add(50);
		arr.add(70);
		arr.add(470);
		arr.add(200);
		arr.add(600);
		arr.add(450);
		arr.add(40);
		//1. can store duplicate value
		//2.
		
		System.out.println(arr.size());
		
		System.out.println(arr.get(2));
		for(int i=0;i<arr.size();i++) {// to print all value of index we use for loop and iterator
			System.out.println(arr.get(i));
			
			
			
			//employee class oblects
			
			Emplyee e1=new Emplyee("tom",29,"IT");
			Emplyee e2=new Emplyee("Siya",30,"Admin");
			Emplyee e3=new Emplyee("Ram",49,"Sales");
			
			
			//creat a aaraylist
			
			ArrayList<Emplyee> ar2=new ArrayList<Emplyee>();
			
			
			ar2.add(e1);
			ar2.add(e2);
			ar2.add(e3);
		 //iterator to traverse the value
			
			Iterator<Emplyee> it =ar2.iterator();
		while (it.hasNext()) {
			Emplyee emp =it.next();
		
			System.out.println(emp.age);
			System.out.println(emp.name);
			System.out.println(emp.dept);
		}
			
			
			
			//****************************
			
			//add.all(); --to merge add all arraylist
			
			ArrayList<String> ar3=new ArrayList<String>();
			ar3.add("10");
			ar3.add("20");
			ar3.add("30");
			
			ArrayList<String> ar4=new ArrayList<String>();
			
		 ar4.add("jia");
		 ar4.add("piya");
		 ar4.add("ananth");
		 ar4.add("arnav");
		 
		 
		 ar3.addAll(ar4);
		 for(int j=0;i<ar3.size();j++) {
			 
			 System.out.println(ar3.get(j));
			 
			 //removeall();
			 //retainAll(); - common list will print
			 
			 
		 }
		 
		
		 
			
			
			
		}
			
			
		

	
		
	}

}
