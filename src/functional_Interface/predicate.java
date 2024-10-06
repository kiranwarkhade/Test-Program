package functional_Interface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class predicate {
	public static void main(String[] ar) {
		List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
        //predicate to check if a name starts with "A"
		Predicate<String> startWithA = name -> name.startsWith("A"); 
		//filter the list using the predicate
		List<String> filterdNames = names.stream().filter(startWithA).collect(Collectors.toList());
		System.out.println(filterdNames);
	
		//combining predicate
	// predicate to check if a number is geter than 10
		Predicate<Integer> isGreterThan10=num-> num > 10;
	
		// predicate to check if a number is even
		Predicate<Integer> isEven=num -> num%2==0;
		
		//Combined Oredicate to check if a number is greter than 10 and even
		Predicate<Integer> isGreterThan10AndEven=isGreterThan10.and(isEven);
		System.out.println(isGreterThan10AndEven.test(12));
		System.out.println(isGreterThan10AndEven.test(9));
		System.out.println(isGreterThan10AndEven.test(11));
	
		//method refrence
		Predicate<String> isEmpty=String::isEmpty;
		System.out.println(isEmpty.test(""));
		System.out.println(isEmpty.test("Hello"));
	}
}