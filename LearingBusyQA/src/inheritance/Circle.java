package inheritance;

public class Circle implements InterfaceShape,InterfaceColor{
	
	public void area()
	{
		System.out.println("Area of circle: "+(3.14*Circle.a));
	}

	
	public void color() {
		
		
		System.out.println("Color should be red");
		
	}

}
