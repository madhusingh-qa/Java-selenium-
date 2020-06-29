package JavaBasics;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
	
		ArrayList arr=new ArrayList();
		
		arr.add(100);
		arr.add(200);
		arr.add(300);
		
		
		System.out.println(arr.size());
		
		//arr.add(100,300);
		arr.add("tom");
		arr.add("hello");
		
		System.out.println(arr.size());
		System.out.println(arr.get(2));
		for(int i=0;i<arr.size();i++) {
			System.out.println(arr.get(i));
		}
			
		
	
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		
		arr1.add(456);
		
		ArrayList<String> arr2 = new ArrayList<String>();
		arr2.add("tom");
		
		
		

	}

	
			
	}


