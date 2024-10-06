package work;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApi implements Serializable {

	// write a program to generate the largest number possible using these digits
	// input : arr()=(8,6,0,4,6,4,2,7)
	// output: larget number: 87664420

	private static final boolean a = true;

	public static void main(String[] args) {

		// List<String> list = Arrays.asList("Kiran", "Sachin", "Ajit", "Bob", "Sam");
		// Stream.of(1, 2, 3, 4, 5).filter(x -> x % 2 != 0).forEach(System.out::print);

		StreamApi name=new StreamApi();
		List<Employee> empList = new ArrayList();
		empList.add(new Employee("Karthik", 1234, 10000));
		empList.add(new Employee("AShok", 123, 20000));
		empList.add(new Employee("Aditya", 321, 30000));
		empList.add(new Employee("Karan", 13, 50000));

		List<Integer> number = new ArrayList();
		number.add(100);
		number.add(102);
		number.add(20);
		number.add(2001);
		number.add(302);
		number.add(400);

		// 1 Write a program to print all the employee names whose name is starting with
		// K
		// 2 Write a program to get all the employee names into separate Lists.
		// 3 Write a program to print who is getting minimul salary.
		// 4 Write a stream program to remove the duplicates.
		// 5 Write a program to print the getempsal with sorted order.

		List<String> nameList1 = new ArrayList<>();
		nameList1.add("Karthik");
		nameList1.add("Karthik 1");
		nameList1.add("Karthik 2");

		List<String> nameList2 = new ArrayList<>();
		nameList2.add("Ashok");
		nameList2.add("Ashok 1");
		nameList2.add("Ashok 2");

		List<List<String>> finalList = new ArrayList<>();
		finalList.add(nameList1);
		finalList.add(nameList2);

		System.out.println(
				"output of flatmap is: " + finalList.stream().flatMap((c) -> c.stream()).collect(Collectors.toList()));

		System.out.println("Emp salary order"
				+ empList.stream().map((d) -> d.getEmpSalary()).sorted().collect(Collectors.toList()));

		System.out.println("out put of sort using java 8 strem");
		number.stream().sorted().forEach((f) -> System.out.println(f));

		System.out.println("out put of sort using java 8 strem");
		number.stream().sorted(Collections.reverseOrder()).forEach((f) -> System.out.println(f));

		List<Integer> duplicates = number.stream().distinct().collect(Collectors.toList());
		System.out.println(duplicates);

		Employee e = empList.stream().min((i1, i2) -> i1.getEmpSalary() - i2.getEmpSalary()).get();
		System.out.println("Min salary emp name is= " + e.getEmpName() + " and salary is= " + e.getEmpSalary());

		// 2 Write a program to get all the employee names into separate Lists
		List<String> separateLists = empList.stream().map((f) -> f.getEmpName()).collect(Collectors.toList());
		System.out.println(separateLists);

		Consumer<Integer> c = (x) -> System.out.println(x);
		// c.accept(10);
		for (int i = 0; i < empList.size(); i++) {
			if (name.check(empList.get(i))) {
				System.out.println("emp name is= " + empList.get(i).getEmpName());
			}
		}

		// to create the Stream
		empList.stream().filter((d) -> d.getEmpName().startsWith("K"))
				.forEach((x) -> System.out.println(x.getEmpName()));

	}

	boolean check(Employee e) {
		if (e.getEmpName().startsWith("K")) {
			return true;
		} else {
			return false;
		}
	}
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	 * List<String> namelist = Arrays.asList("jay", "kisan", "shankar", "rohit");
	 * Stream<String> stringstream = namelist.stream();
	 * 
	 * Predicate<String> lengthPredicate = st -> st.length() <= 5; List<String>
	 * finalnames =
	 * namelist.stream().filter(lengthPredicate).collect(Collectors.toList());
	 * finalnames.forEach(st -> System.out.println(st));
	 * System.out.println("---------------------------------"); Set<String>
	 * finalname =
	 * namelist.stream().filter(lengthPredicate).collect(Collectors.toSet());
	 * finalname.forEach(st -> System.out.println(st));
	 * 
	 * System.out.println("---------------------------------"); String finalnam =
	 * namelist.stream().filter(lengthPredicate).collect(Collectors.joining(","));
	 * System.out.println("nameComma= " + finalnam);
	 */

