package demo;

import java.util.HashMap;
import java.util.Map;

public class CharacterCounter {
	public static void main(String[] args) {
		String inputString = "kiran warkhade";
		Map<Character, Integer> charCountMap = new HashMap<>();

		// Convert the input string to lowercase to consider 'A' and 'a' as duplicates
		inputString = inputString.toLowerCase();

		// Iterate through the characters in the string and update the character count
		// map
		for (char c : inputString.toCharArray()) {
			if (Character.isLetter(c)) {
				charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
			}
		}

		// Display the characters and their counts for duplicates
		for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey() + " = " + entry.getValue() + " times");
			}
		}
	}
}
