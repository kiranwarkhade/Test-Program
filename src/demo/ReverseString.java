package demo;

public class ReverseString {
	public static void main(String[] args) {
		String original = "Hello, World!";
		String reversed = reverseString(original);
		System.out.println("Original string: " + original);
		System.out.println("Reversed string: " + reversed);
		
	}
	
	public static String reverseString1(String str) {
		char[] chararr = str.toCharArray();
		String reversed = "";
		for (int i = chararr.length - 1; i >= 0; i--) {
			reversed += chararr[i];
		}
		return reversed;
	}
	////////////////////////////////////////

	public static String reverseString(String str) {
		char[] charArray = str.toCharArray();
		int left = 0;
		int right = charArray.length - 1;

		while (left < right) {
			char temp = charArray[left];
			charArray[left] = charArray[right];
			charArray[right] = temp;
			left++;
			right--;
		}

		return new String(charArray);
	}
	
	

	
	
}
