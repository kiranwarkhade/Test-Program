package demo;

public class StringLength {
	
	public static void main(String[] ar) {
		String input="Hello";
		int length= getLength(input);
		System.out.println("Length of the String = " + length);
		
	}
	
	public static int getLength(String str)
	{
		int length=0;
		char[] charArray=str.toCharArray();
		for(char c: charArray)
		{
			length++;
			
		}return length;
 	}

}
