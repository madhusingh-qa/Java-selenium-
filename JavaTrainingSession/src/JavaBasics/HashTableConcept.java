package JavaBasics;

import java.util.Hashtable;

public class HashTableConcept {

	public static void main(String[] args) {
		
		Hashtable h = new Hashtable();
		h.put(1, 100);
		h.put("A", "tom");
		h.put("B", "hellop");
		h.put("C", "World");
		
		System.out.println(h.size());
		System.out.println(h.get("C"));
		
	Hashtable<Integer,Integer> h1 = new Hashtable<Integer,Integer>();
	
		
 h1.put(1, 567);
 System.out.println(h1.size());
 System.out.println(h1.get(1));
 
 for(int i=0;i<h1.size();i++) {
	 System.out.println(h1.get(i));
	
 
 }
		
	}

}
