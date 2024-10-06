package functional_Interface;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class supplier {

	public static void main(String[] ar) {
		
		  Supplier<String> stringSupplier = () -> "Hello, World";
		  
		  // using the suplier
		  String result = stringSupplier.get();
		  System.out.println(result);
		 
		// Supplier&Consumer ex

		Supplier<String> stringSuppliers = () -> "Hello,World";

		Consumer<String> printConsumer = (s) -> System.out.println(s);

		String suppliedString = stringSuppliers.get();
		printConsumer.accept(suppliedString);
	}
}
