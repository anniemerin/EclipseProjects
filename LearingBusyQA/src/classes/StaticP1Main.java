package classes;

public class StaticP1Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Accessing static variable directly using the class name
        System.out.println("Initial count: " + StaticP1.count);

        // Calling static method to increment count
        StaticP1.increment();
        System.out.println("Count after increment: " + StaticP1.count);

        // Calling static method to reset count
        StaticP1.reset();
        System.out.println("Count after reset: " + StaticP1.count);

	}

}
