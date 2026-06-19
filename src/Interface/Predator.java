package Interface;

public interface Predator {
	void Predators();

	default void Test() {
		System.out.println("You can as well use Concrete Methods in interfaces but mus have either of these " +
                "3 prefix " +
                "1- default  " +
                "2- private" +
                "2- Static" +
                "in modern java "


        );
	}
}
