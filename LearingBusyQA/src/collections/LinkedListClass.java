package collections;

import java.util.LinkedList;

public class LinkedListClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList <String> List=new LinkedList <>();
		
		List.add("Merin");
		List.add("Annie");
		List.add("Remove");
		List.add("Thomas");
		List.add("Nathania");
		List.add("Isabel");
		List.add("Thomas");
		
		System.out.println("Display element in the Linked List : "+List);
		System.out.println("\nIterate through Linked list : ");
		for(String name :List)
			System.out.println(name);
		List.sort(null);
		
		System.out.println("\nIterate through Linked list after sorting : ");
		for(String name :List)
			System.out.println(name);
		
		List.remove(6);
		System.out.println("\nDisplay afer removing element at 5th position : "+List);
		
		List.addFirst("First");
		List.addLast("Last");
		System.out.println("\nDisplay element in the Linked List : "+List);
		
		List.removeFirst();
		List.removeLast();
		System.out.println("\nDisplay element in the Linked List : "+List);
		
		System.out.println("\nDisplay element in the Linked List : "+List.iterator());
	}

}
