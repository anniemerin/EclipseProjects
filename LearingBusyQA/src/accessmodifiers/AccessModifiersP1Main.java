package accessmodifiers;

import inheritance.AccessModifiersP2;

public class AccessModifiersP1Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AccessModifiersP1 P1=new AccessModifiersP1();
		System.out.print("Calling public method in a same package :");
		P1.displaypublic();
		System.out.println("Public variable in same package :"+P1.publicv); //public variable
				
		AccessModifiersP2 P2=new AccessModifiersP2();
		P2.dispaly1();
		
		
		System.out.println("\n\nprotected variable in same package:"+P1.protect); //protected variable
		P1.displayprotected();
		
		
//		P2.dispaly2();// protected method outside package
		
		
		System.out.println("\n\ndefault variable in same package:"+P1.defaultv); //protected variable
		P1.displaydefault();
		
		
	//	System.out.println("\n\nprivate variable in same package and not subclass:"+P1.privatev); //private variable
	//	P1.displayprivated();

	}

}
