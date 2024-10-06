package functional_Interface;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.List;
public class function {

	public static void main(String[] ar)
	{
		//function to square a number
		Function<Integer, Integer> square=x -> x*x;
		System.out.println(square.apply(5));
		
		
		List<String> names=Arrays.asList("Alice","Bob","Charlie");
		//function to get the length of a string
		Function<String, Integer> length=String::length;
	
		// Apply the function to each element in the using map()
		List<Integer> lengths=names.stream().map(length).collect(Collectors.toList());
		System.out.println(lengths);
	
	
		//Function to convert a string to uppercase
		Function<String, String> toUpperCase=String::toUpperCase;
		System.out.println(toUpperCase.apply("hello"));
	}
}
