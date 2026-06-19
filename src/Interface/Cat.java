package Interface;

public class Cat implements Predator, Prey {


	public void Predators() {
		System.out.println("Cats are predator");
	}


    public void Preys() {
        System.out.println("Cats can also be preys");
    }

   public void Conccrete(){
        System.out.println("Concrete Methods implemented");
    }
}
