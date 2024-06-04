package classes;

public class MethodOverloadingP1 {

	int add(int x, int y) {  //x=5 and y=3
        return x + y; //return 5+3 == 8
        }
       
     // Method to add three integers
    int add(int x, int y, int z) {
        return x + y + z;
    }

    // Method to add two doubles
    double add(double x, double y) {
        return x + y;
    }

    // Method to add three doubles
    double add(double x, double y, double z) {
        return x + y + z;
    }

    // Method to add an integer and a double
    double add(int x, double y) {
        return x + y;
    }

    // Method to add a double and an integer
    double add(double y, int x) {
        return x + y;
    }
	
}
