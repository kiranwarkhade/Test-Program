package demo;

import java.util.Arrays;

public class LargeNo {
	public static void main(String[] args) {

		// write a program to generate the largest number possible using these digits
		// input : arr()=(8,6,0,4,6,4,2,7)
		// output: larget number: 87664420

		int arr[] = { 8, 6, 0,4, 6, 4, 2, 7 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		String result="";
		for(int i=0;i<arr.length;i++)
		{
			result=result+arr[i];
		}
		System.out.println(result);
	}

}
