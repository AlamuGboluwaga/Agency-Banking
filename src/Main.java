//import Interface.Dog;
//import Abstraction.Cat;
//import Abstraction.Dog;
import Polymophism.CompileTimePolymophism.Calculator;
import RunTimePolymophism.CreditCardProcessor;
import RunTimePolymophism.PaymentProcessor;

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
		//In Java, an Interface is a blueprint of a class.
		// It is a collection of abstract methods (methods without a body) and constant variables,
		// though as we saw, it can also contain certain types of concrete methods in modern Java.
		//  can have different methods (concrete, abstract)
		//It allows a child class to implement more than one interface from the parent
//		Cat cat = new Cat();
//		cat.Predators();
//		cat.Preys();
//		cat.Test();
//		cat.Conccrete();
		//        Dog dog  = new Dog();
		//        dog.Predators();
		//        dog.Preys();
		//        dog.dogs();


        //Polymorphism is one of the four core pillars of Object-Oriented Programming (OOP). The word itself comes from Greek, meaning "many forms" (poly = many, morph = form).
        //
        //In Java, polymorphism allows us to perform a single action in different ways. More technically, it allows a subclass to share the interface of its superclass but provide its own specific behavior.
        //
        //There are two distinct types of polymorphism in Java:
        //
        // 1 - Compile-time Polymorphism (Static Binding)
        //
        // 2 - Runtime Polymorphism (Dynamic Binding)

        Calculator calc = new Calculator();

        System.out.println(calc.add(5, 10));      // Calls the first method
        System.out.println(calc.add(5, 10, 15));  // Calls the second method
        System.out.println(calc.add(5.5, 4.5));   // Calls the third method



        // Upcasting: Parent reference points to Child objects
        PaymentProcessor payment1 = new CreditCardProcessor();
        PaymentProcessor payment2 = new PaymentProcessor();

        // Even though the reference type is PaymentProcessor,
        // Java executes the specific subclass methods at runtime.
        payment1.processPayment(100.0); // Output: Processing credit card payment...
        payment2.processPayment(50.0);  // Output: Processing PayPal payment...
	}
}
