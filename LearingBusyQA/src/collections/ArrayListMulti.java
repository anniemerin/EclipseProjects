package collections;

import java.util.ArrayList;

public class ArrayListMulti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList <Object> List=new ArrayList<Object>();
		List.add("Merin");
		List.add(1);
		List.add(null);
		List.add(true);
		List.add('C');
		List.add(1.2);
		List.add(12345678.765);
		
		System.out.println("Display List: "+List);
		
		System.out.println("\nIterate through List: ");
		for (Object name:List)
			System.out.println(name);
		

	}

}