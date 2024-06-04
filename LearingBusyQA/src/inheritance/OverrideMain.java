package inheritance;

public class OverrideMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		DogOverride dog=new DogOverride();
		
		AnimalOverride dogp=new DogOverride();

		CatOverride cat= new CatOverride();
		
		AnimalOverride catp=new CatOverride();
		
		AnimalOverride animal=new AnimalOverride();
		
		dog.sound();
		dogp.sound();
		cat.sound();
		catp.sound();
		animal.sound();

	}

}
