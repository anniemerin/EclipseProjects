package accessmodifiers;

public class AccessModifiersP1 {
	
	public int publicv=100;
	protected int protect=90;
	int defaultv=80;
	private int privatev=50;
	
	public void displaypublic()
	{
		System.out.println("I am public method ");
	}
	
	protected void displayprotected()
	{
		System.out.println("I am protected method ");

	}
	

	 void displaydefault()
	{
		System.out.println("I am default method ");

	}
	 
	 private void displayprivated()
	 {
		 System.out.println("I am private method ");
	 }

}
