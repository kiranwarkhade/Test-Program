import java.util.Arrays;

public class A {
	public static void main(String[] args) {
        String [] arr={"abcde", "abd","abcfe","abde"};
        
        //find the most common prefix 
   String prefix=Arrays.stream(arr)
		   .reduce((s1, s2) -> {
			   int minlength=Math.min(s1.length(),s2.length());
			   int i=0;
			   while(i < minlength && s1.charAt(i)== s2.charAt(i))
			   {
				 i++;  
			   }
			   return s1.substring(0, i);
		   }) .orElse("");
		   System.out.println("Longest common prefix: "+ prefix);
	}
}
