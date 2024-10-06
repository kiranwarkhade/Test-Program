package modifiersJava;

class AccessModifierExample {

	// Public variable
	public String publicVar = "I am public";

	// Private variable
	private String privateVar = "I am private";

	// Protected variable
	protected String protectedVar = "I am protected";

	// Default (package-private) variable
	String defaultVar = "I am default";

	public void display() {
		System.out.println(publicVar);
		System.out.println(privateVar);
		System.out.println(protectedVar);
		System.out.println(defaultVar);
	}
}

public class Modifires1 {
	public static void main(String[] args) {
		AccessModifierExample example = new AccessModifierExample();
		example.display();

		// Accessing public variable
		System.out.println(example.publicVar);

		// The following line would cause an error:
		// System.out.println(example.privateVar); // Error: privateVar has private
		// access

		// The following line would also cause an error if this Test class is not in the
		// same package:
		//System.out.println(example.protectedVar); // Error: protectedVar has protected access

	}
}
