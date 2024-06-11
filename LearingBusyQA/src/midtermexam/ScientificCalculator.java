package midtermexam;

public class ScientificCalculator extends Calculator{
	
	double square=0;
	double cube=0;

	
	double findSquare(double num) {
		
		square=num*num;
		return square;		
		
	}
	
	double findCube(double num) {
		
		cube=num*num*num;
		return cube;
	}
	
}
