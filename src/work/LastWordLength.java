package work;




public class LastWordLength {

	public static void main(String[] args) {
		
		String s1=" Hello World";
		String s2="    fly me   to   the moon  ";
		String s3="luffy is still joyboy ";
		
		
		System.out.println("Output: "+ lengthOfLastWord(s1));
		System.out.println("Output: "+ lengthOfLastWord(s2));
		System.out.println("Output: "+ lengthOfLastWord(s3));
	}
	
	public static int lengthOfLastWord(String s)
	{
		s=s.trim();
		
		int lastSpaceIndex=s.lastIndexOf(" ");
		
		return s.length() - lastSpaceIndex - 1;
	}

}




