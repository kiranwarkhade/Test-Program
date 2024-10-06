package java_8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class MethodRefs {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("Kiran", "Sachin", "Ajit", "Bob", "Sam");

		list.forEach(name -> System.out.println(name));// Lambda
		list.forEach(System.out::print);// Method Reference

		// Create a HashMap
		Map<String, Integer> ma = new HashMap<>();
		ma.put("Hello", 1);
		ma.put("World", 2);
		ma.put("Java", 3);

		// Print the lengths of the keys using method reference
		ma.keySet().forEach(MethodRefs::printLength);
		System.out.println(ma);
	}

	// Method to print the length of a string
	public static void printLength(String s) {
		System.out.println(s + " length: " + s.length());
	}

	/*
	 * String str="Hello kiran"; Function<String, Integer> map=String::length;
	 * list.forEach(nam -> System.out.println(map.apply(nam)));
	 */
	/*
	 * Consumer<String> p=MethodRefs::print; p.accept(str);
	 */

	/*
	 * Runnable print=MethodRefs::print; print.run();
	 */

	public static void print(String s) {
		// String ss="Java";
		// System.out.print(ss.length()+ " ");
	}

}
