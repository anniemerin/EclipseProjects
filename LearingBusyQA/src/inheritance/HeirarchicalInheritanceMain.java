package inheritance;

public class HeirarchicalInheritanceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DogHeirarchicalInheritance dog = new DogHeirarchicalInheritance();
		CatHeirarchicalInheritance cat = new CatHeirarchicalInheritance();
		
		dog.eat();
		dog.bark();
		
		cat.eat();
		cat.meow();

	}

}
