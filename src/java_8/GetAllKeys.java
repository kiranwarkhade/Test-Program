package java_8;
import java.util.HashMap;
import java.util.Set;
public class GetAllKeys {

	public static void main(String[] args) {
		// Create a HashMap
		HashMap<String, Integer> map = new HashMap<>();

		// Add some key-value pairs
		map.put("Apple", 10);
		map.put("Banana", 20);
		map.put("Orange", 30);

		// Get all keys from the HashMap
		Set<String> keys = map.keySet();

		// Iterate over the keys and print them
		for (String key : keys) {
			System.out.println("Key: " + key);
		}
	}
}
