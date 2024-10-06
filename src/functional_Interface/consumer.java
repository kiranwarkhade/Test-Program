package functional_Interface;

import java.util.function.Consumer;


public class consumer<T> {
	
	public static void main(String[] args) {
		
		//Creating a Consumer to print a String
		Consumer<String> printConsumer=(s)-> System.out.println(s);
		
		// using the Consumer
		printConsumer.accept("Hello, World");
		
	}
}
