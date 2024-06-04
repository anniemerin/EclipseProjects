package inheritance;

public class Square implements InterfaceDraw {

	@Override
	public void area() {
		// TODO Auto-generated method stub
		
		System.out.println("Area of square is : "+(Square.a*Square.a));
		
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Draw a square with length as: "+Square.a);
	}

	@Override
	public void color() {
		// TODO Auto-generated method stub
		
		System.out.println("Color should be Blac");
		
	}

}
