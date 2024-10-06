package array;

public class ArrayExample {
	public static void main(String[] args) {

		int[][] jagged = 
			  { { 1, 2 },
				{ 3, 4, 5, 6, 7, 8},
				{ 6 } };
		System.out.println(jagged[1][4]);
		
		
		// Declare and initialize an array of integers
		int[] numbers = { 10, 20, 30, 40, 50 };

		// Access and print elements of the array
		System.out.println("First element: " + numbers[0]);
		System.out.println("Last element: " + numbers[numbers.length - 1]);

		// Modify an element
		numbers[2] = 35;

		// Traverse and print all elements using a for loop
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Element at index " + i + ": " + numbers[i]);
		}

		// Find and print the sum of array elements
		int sum = 0;
		for (int num : numbers) {
			sum += num;
		}
		System.out.println("Sum of elements: " + sum);
	}
}