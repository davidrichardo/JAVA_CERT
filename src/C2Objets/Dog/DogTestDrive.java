package C2Objets.Dog;

public class DogTestDrive{
	public static void main(String args[]){
		Dog pastor = new Dog();
		pastor.size = 42;
		pastor.breed="Pastor Aleman";
		pastor.name = "Atomo";
		System.out.println("Breed is: "+ pastor.breed );
		pastor.bark();
		}
}