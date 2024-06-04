package collections;

import java.util.ArrayList;

public class ArrayListClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList <String> List =new ArrayList <>();
		
		List.add("Merin");
		List.add("Annie");
		List.add("Nathania");
		List.add("Thomas");
		List.add("Isabel");
		List.add("Thomas");
		List.add("Merin");
		
		System.out.println("Size of the List : "+List.size());
		System.out.println("\nDisplay Elements in the List:"+List);
		// Display Elements.
		
		System.out.println("\nIterate over the Elements in the List:");
		
		for (String name:List)
			System.out.println(name);
		
		List.remove(5);		
		System.out.println("\nDisplay Elements in the List after removing element at 6th position:");
		for (String name:List)
			System.out.println(name);
		
		System.out.println("\nTo check if a particular element exists in list: " +List.contains("Merin"));
		System.out.println("\nTo check the element at position 5 in list: " +List.get(4));
		System.out.println("\nTo check the position of an element in list: " +List.indexOf("Thomas"));
		List.sort(null);
		System.out.println("\nDisplay Elements after Sort:");
		for (String name:List)
			System.out.println(name);
		List.clear();		
		System.out.println("\nDisplay Elements in the List after clearing:"+List);
		
			

		
	}

}