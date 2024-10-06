package demo;

public class SortArrayNo {
	public static void main(String[] args) {

		int[] numbers = { 3, 5, 7, 2, 8, -1, 4, 10, 12 };
		sortArray(numbers);
		for (int number : numbers) {
			System.out.println(number);
		}
	}

	public static void sortArray(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;

				}
			}
		}
	}
}
