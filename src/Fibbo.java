
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Fibbo {

	public static void main(String[] args) {
		System.out.println("Hello");

		String firstString = "Gaurav";
		String secondString = "Gaurav";
		String thirdString = new String("Gaurav");
		System.out.print("Case 1 : ");
		System.out.println(firstString == secondString);
		System.out.print("Case 2 : ");
		System.out.println(firstString == thirdString);
		System.out.print("Case 3 : ");
		System.out.println(firstString.equals(thirdString));

		List<Integer> numbers = Arrays.asList(2, 4, 3, 1, 5, 7, 8, 78, 67);
		Optional<Integer> greterThanThree = numbers.stream().filter(n -> n <= 8).max(Comparator.naturalOrder());
		// .collect(Collectors.toList());
		greterThanThree.ifPresent(n -> System.out.println(n));

		System.out.println(greterThanThree);

	}

}

/*
 * // TODO Auto-generated method stub //0, 1, 1, 2, 3, 5, 8, .. and then logic
 * to populate fibbonacci series up to first 15 numbers int n=15; int[] num= new
 * int[n];
 * 
 * num[0]=0; num[1]=1;
 * 
 * for(int i=2;i <n;i++) { num[i]=num[i -1] +num[i-2];
 * 
 * } for(int i=0; i< n;i++) { System.out.println(num[i]+ " "); }
 * 
 * List<Integer> reverse= Stream //.collect(Collector.toList()).
 */
