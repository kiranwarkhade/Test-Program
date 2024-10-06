package demo;

public class FindMaxno {
public static void main(String[] args) {
	
	int[] number = { 3, 5, 7, 2, 8, -1, 4, 10, 12, 555 };
	int max=findmax(number);
	System.out.println(max);
}

public static int findmax(int[] arr)

{
	int max = arr[0];
	for (int i = 1; i < arr.length; i++) {
		if (arr[i] > max) {
			max = arr[i];
		}
	}
	return max;
}
}

