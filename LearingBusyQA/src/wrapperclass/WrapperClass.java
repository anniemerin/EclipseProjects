package wrapperclass;

public class WrapperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int primitiveInt=10;
		char primitiveChar='C';
		boolean primitiveBoolean=true;
		
		// Boxing
		System.out.println("Boxing");
		Integer wrappedInt=Integer.valueOf(primitiveInt);
		Character wrappedChar=Character.valueOf(primitiveChar);
		Boolean wrappedBoolean=Boolean.valueOf(primitiveBoolean);
		
		System.out.println("Integer after boxing : "+wrappedInt);
		System.out.println("Character after boxing : "+wrappedChar);
		System.out.println("Boolean after boxing : "+wrappedBoolean);
		
		//Unboxing
		System.out.println("\nUnboxing");		
		primitiveInt=wrappedInt.intValue();
		primitiveChar= wrappedChar.charValue();
		primitiveBoolean=wrappedBoolean.booleanValue();
		
		System.out.println("Integer after unboxing : "+primitiveInt);
		System.out.println("Character after unboxing : "+primitiveChar);
		System.out.println("Boolean after unboxing : "+primitiveBoolean);
		
		
		// Auto-boxing
		System.out.println("\nAuto-Boxing");
		Integer autowrappedInt=primitiveInt;
		Character autowrappedChar=primitiveChar;
		Boolean autowrappedBoolean=primitiveBoolean;
		
		System.out.println("Integer after autoboxing : "+autowrappedInt);
		System.out.println("Character after autoboxing : "+autowrappedChar);
		System.out.println("Boolean after autoboxing : "+autowrappedBoolean);
		


	}

}
