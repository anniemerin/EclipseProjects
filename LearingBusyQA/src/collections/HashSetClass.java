package collections;

import java.util.HashSet;

public class HashSetClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> hashSet=new HashSet<String>();
		
		hashSet.add("Merin");
		hashSet.add("Annie");
		hashSet.add("Thomas");
		hashSet.add("Nathania");
		hashSet.add("Isabel");
		hashSet.add("Remove");
		hashSet.add("Nathania");
		hashSet.add(null);
		
		System.out.println("Display elements in Hash Set : "+hashSet);	
		
		
		System.out.println("\nIterate through elements in Hash Set : ");			
		for (Object name:hashSet)
			System.out.println(name);
	
		
		hashSet.remove(null);
		hashSet.remove("Remove");
		System.out.println("Display Hash Set after removing null and Remove: "+hashSet);
	}

}
