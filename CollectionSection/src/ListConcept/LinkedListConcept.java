package ListConcept;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
		
		LinkedList<String> ll = new LinkedList<String>();
		
		ll.add("selenium");
		ll.add("Python");
		ll.add("Java");
		ll.add("Ruby");
		ll.add("Jmeter");
		
		System.out.println(ll);
		//addfirst
		
		ll.addFirst("Naveen");
		ll.addLast("Automation");
		System.out.println("content of linkedlist:-" +ll);
		System.out.println(ll.get(0));
		ll.set(0,"tom");
		System.out.println(ll.get(0));
		// remove 
		
		ll.removeFirst();
		ll.removeLast();
		System.out.println("the content of linkedlist:"+ll);
		
		
		// how to print values 
		// using for loop
		
		System.out.println("***** using for loop");
		
		for (int i=0;i<ll.size();i++) {
			System.out.println(ll.get(i));
			
			
			// advance for loop
			
			System.out.println("******- using advance for loop");
			
			for (String str:ll) {    // for each loop
				System.out.println(str);
				
			}
				
				// iterator
				
				System.out.println("********-using iterator");
				Iterator<String> it =ll.iterator();
				while(it.hasNext()) {
					System.out.println(it.next());
				}
					
					//while loop
					
					System.out.println("******-while loop");
					
								
					int num=0;
					
					while(ll.size()>num) {
						System.out.println(ll.get(num));
						num++ ;
						
					}
						
						
						
					
					
					
				
				
			  
	  			
			
		}
		}
		
	}


