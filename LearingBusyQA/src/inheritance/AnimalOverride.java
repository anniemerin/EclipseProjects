package inheritance;

public class AnimalOverride {
	
	void sound()
	{
		System.out.println("Animal makes sounds...");
	}

}

class DogOverride extends  AnimalOverride{
	
	void sound ()
	{
		System.out.println("Dog barks...");
	}
}

class CatOverride extends  AnimalOverride {
	
	void sound ()
	{
		System.out.println("Dog meows...");
	}
}
