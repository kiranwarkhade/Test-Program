package demo;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*int[] number1 = {1,3,4,2,4};
  int[] number2 = {6,3,2,4,5,3,2};
  int[] number3 = {7,3,3,2,2,8,4,9,4};

  output : {1=1, 2=5, 3=5, 4=5, 5=1, 6=1, 7=1, 8=1, 9=1}
*/

public class ArrayOccurence {

	public static void main(String[] args) {
		int[] number1 = { 1, 3, 4, 2, 4 };
		int[] number2 = { 6, 3, 2, 4, 5, 3, 2 };
		int[] number3 = { 7, 3, 3, 2, 2, 8, 4, 9, 4 };

		Map<Integer, Long> frequency = Stream.of(number1, number2, number3)
				.flatMapToInt(Arrays::stream)
				.boxed()
				.collect(Collectors.groupingBy(e -> e, Collectors.counting()));

		System.out.println(frequency);
	}
}
