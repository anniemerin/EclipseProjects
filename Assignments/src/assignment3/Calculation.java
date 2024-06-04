package assignment3;

public class Calculation {
	
	int var1;
	int var2;
	int var3;
	
	//Create a constructor to assign value
	
	
	Calculation (int var1, int var2, int var3)
	{
		this.var1=var1;
		this.var2= var2;
		this.var3=var3;
		
	}
	
	//create another method ‘sum’ to calculate sum of 3 numbers.​
	
	void sum()
	{
		System.out.println("Sum of three numbers : "+ (this.var1+this.var2+this.var3));
	}

}
