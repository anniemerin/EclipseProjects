package collections;

import java.util.HashMap;

public class HashMapClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> hashMap=new HashMap<Integer, String>();
		
		hashMap.put(1, "Merin");
		hashMap.put(2,"Annie");
		hashMap.put(4,"Nathania");
		hashMap.put(3, "Thomas");
		hashMap.put(5,"Isabel");
		hashMap.put(null, null);
		hashMap.put(null, null);
		hashMap.put(6, null);
		
		System.out.println("Disply elements : "+hashMap);
			
		System.out.println("Conatins a value: "+hashMap.containsValue("Take"));
		System.out.println("Conatins a key: "+hashMap.containsKey(2));
		System.out.println("Get Key: "+hashMap.get(hashMap));
		hashMap.putIfAbsent(7, "Achu");
		System.out.println("Disply elements : "+hashMap);
		hashMap.replace(7, "Achutty");
		System.out.println("Disply elements : "+hashMap);
		
	

	}

}
