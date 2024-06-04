package inheritance;

public class AnimalMultiIheritance {
	
	void eat()
	{
		System.out.println("I am eating...");
	}

}

class DogMultiInheritance extends AnimalMultiIheritance{
	
	void bark()
	{
		System.out.println("Dog is barking...");
	}
}

class PuppyMultiInheritance extends DogMultiInheritance {
	
	void weep()
	{
		System.out.println("Puppy is weeping...");
	}
}
