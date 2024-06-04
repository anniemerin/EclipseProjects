package inheritance;

public class AnimalHeirarchicalInheritance {
	
	void eat()
	{
		System.out.println("Animal eats....");
	}

}

class DogHeirarchicalInheritance extends AnimalHeirarchicalInheritance {
	
	void bark ()
	{
		System.out.println("Dog barks......");
	}
	
}

class CatHeirarchicalInheritance extends AnimalHeirarchicalInheritance {
	
	void meow()
	{
		System.out.println("Cat meows....");
	}
	
}
