package classes;

public class ThisKeyword {
	
int a, b;
	
	void add (int a, int b) {// a=5 and b=5
	//	a = a;
		//b = b;
		
	this.a = a;
		this.b = b;
	}

	void display() {
		System.out.println(a);
		System.out.println(b);
	}

}
