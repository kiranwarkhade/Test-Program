package java_8;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateCharacterCounter {
	public static void main(String[] args) {
		String inputString = "Hellol india is my country";

		// Convert the input string to lowercase to consider 'A' and 'a' as duplicates

		inputString = inputString.toLowerCase();

		// Use the Stream API to count duplicate characters

		Map<Character, Long> charCountMap = inputString.chars().mapToObj(c -> (char) c).filter(Character::isLetter)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		// Display the characters and their counts for duplicates

		charCountMap.entrySet().stream().filter(entry -> entry.getValue() > 1)
				.forEach(entry -> System.out.println(entry.getKey() + " = " + entry.getValue() + " times"));

	}
}
