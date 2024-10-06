package demo;

import java.util.HashMap;
import java.util.Map;

public class firstOccurrence {

	public static void main(String[] args) {

		// find first occurrence
		// input : abcc output: {a=1, b=1, c=2}
		String s = "abcc warkh";
		char ch;
		Map<Character, Integer> map = new HashMap();
		for (int i = 0; i < s.length(); i++) {
			ch = s.charAt(i);
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
				
			} else {
				map.put(ch, 1);
			}
		System.out.println(map);
	}

	}}
