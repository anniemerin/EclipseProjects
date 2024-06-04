package assignments2;

public class AnnieCompare2stringsignoringcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Write a java program to compare two strings, ignoring case differences.
		
		String str1="WelcOmE";
		String str2= "welCome";
		boolean ignorecase​= str1.equalsIgnoreCase(str2);
		System.out.println("String is compared ignoring case differences: "+ignorecase​);

	}

}
