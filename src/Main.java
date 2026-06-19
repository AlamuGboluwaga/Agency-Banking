import Abstraction.Animal;
//import Interface.Dog;
import Interface.Cat;
//import Abstraction.Cat;
//import Abstraction.Dog;
import inheritance.Female;
import inheritance.Human;
import inheritance.Male;

public class Main {

	public void main(String[] args) {
		// INHERITANCE
		//		Human human = new Human();
		//		human.human();
		//        Female female = new Female();
		//        female.human();
		//        female.female();
		//ABSTRACTION
		// Note the Abstract method must be implemented in all the children classes
		//Note the Concrete method does not need to be implemented at all it will be inherited automatically when called
		//		Dog dog = new Dog();
		//		Cat cat = new Cat();
		//		dog.Sound();
		//		dog.Dogs();
		//		dog.Animals();
		//		dog.Eyes();
		//		cat.Sound();

		// INTERFACES
		//  can have different methods (concrete, abstract)
		//It allows a child class to implement more than one interface from the paren
		Cat cat = new Cat();
		cat.Predators();
		cat.Preys();
		cat.Test();
		//        Dog dog  = new Dog();
		//        dog.Predators();
		//        dog.Preys();
		//        dog.dogs();

	}
}
