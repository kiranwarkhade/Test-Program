package demo;

public class CheckPalindrome {

	public static void main(String[] args) {
		
		boolean b=checkPalindrome(null);
		
	}
	
	public static boolean checkPalindrome(String str) {
		int length = getLength(str);
		char[] charar = str.toCharArray();
		for (int i = 0; i < length / 2; i++) {
			if (charar[i] != charar[length - i - 1]) {
				return false;
			}
		}
		return true;
	}

	public static int getLength(String str) {
		int length = 0;
		char[] charar = str.toCharArray();
		for (char c : charar) {
			length++;

		}
		return length;
	}

}
