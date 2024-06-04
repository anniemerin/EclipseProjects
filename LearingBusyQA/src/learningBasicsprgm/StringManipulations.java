package learningBasicsprgm;

public class StringManipulations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Srikant is AT tutor";
		int lengthOfString = str.length();
		System.out.println("Length of the String is: "+lengthOfString );
		
		String str2 = " OF April Batch";
		String concatenatedString = str.concat(str2);
		System.out.println("Concat final string is: "+ concatenatedString);
	
		String stringWithSpaces = "   Trim me!   ";
		String trimmedString = stringWithSpaces.trim();
		System.out.println("Trimmed string:" + trimmedString);
		
		 // charAt()
		String strcharAT = "Srikant is AT tutor";
        char characterAtIndex3 = strcharAT.charAt(3);
        System.out.println("Character at index 3: " + characterAtIndex3);
        
        //contains()
        String strcharAT2 = "Hello Students at busyQA";
        boolean containsHello = strcharAT2.contains("busy123");
        System.out.println("String has 'busy123': " + containsHello);
        
        //equals
        String streql1 = "Welcome";
        String streql2 = "welcome";
        boolean isEqual = streql1.equals(streql2);
        System.out.println("Strings are equal: " + isEqual);
        
        
      //equalsignorecase
        boolean isequalsIgnoreCase = streql1.equalsIgnoreCase(streql2);
        System.out.println("Strings comparision with equalsIgnoreCase: " + isequalsIgnoreCase);
        
        
        // substring()
        String str5 = "Hello Students at busyqa";
        String substring = str5.substring(7);
        System.out.println("Substring from index 7: " + substring);
        
        substring = str5.substring(1,8); // start a 1 and go until 8 element in the list
        System.out.println("Substring from index 1 to 8: " + substring);
        
      //replace
        String str6 = "Hello world, your in new programming world";
        String replacedString = str6.replace("world", "Universe");
        System.out.println("Replaced string: " + replacedString);
        
     // toLowerCase()
        String str7 = "HELLO WORLD i am srikant";
        String lowercaseString = str7.toLowerCase();
        System.out.println("Lowercase string: " + lowercaseString);

        // toUpperCase()
        String str8 = "HELLO WORLD i am srikant";
        String uppercaseString = str8.toUpperCase();
        System.out.println("Uppercase string: " + uppercaseString);

	}

}
