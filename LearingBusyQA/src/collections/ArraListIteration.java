package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraListIteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> List = new ArrayList<String>();
		List.add("Merin");
		List.add("Annie");
		List.add("Thomas");
		List.add("Nathani");
		List.add("Isabel");

		Iterator<String> itr = List.iterator();

		
		  while (itr.hasNext())
		  {
			  String element=itr.next();
			  System.out.println(element);
		  }
		 itr=List.iterator();

		while (itr.hasNext()) 
		{
			String element1 = itr.next();
		
			if (element1.equals("Thomas"))
			{
				itr.remove();

			}

		}
		System.out.println("After removal " + List);
	}

}