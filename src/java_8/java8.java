package java_8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class java8 {

	public static void main(String[] ar) {
		List<Integer> list = Arrays.asList(5, 4, 3, 2, 1);
		Set<Integer> set=new HashSet<>();
		set.add(11);
		set.add(4);
		set.add(44);

		// list.stream().filter(t -> t % 2 == 0).forEach(t -> System.out.println(t));

		set.stream().sorted().collect(Collectors.toList()).forEach(x ->System.out.println(x));

	
		// filter(x -> x % 2 ==0).collect(Collectors.toList())
		// .forEach(x -> System.out.println(x));
		// System.out.println(x -> System.out::print);

	}
}
