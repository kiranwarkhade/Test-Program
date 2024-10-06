package work;

public class LongestPalindromesubString {

	public static void main(String[] args) {
		
		String str="forgeeksskeegfor";
		
		System.out.println("Palindrome String is: "+ str);
		
		System.out.println("Longest Palindrome subString is: "+ longestPalindrome(str));

	}
	
	public static String longestPalindrome(String s)
	{
		int n=s.length();
		if(n==0) return "";
	
		boolean[][] dp=new boolean[n][n];
		int start=0;
		int maxlength=1;
		
		for(int i=0; i<n; i++)
		{
			dp[i][i]=true;
		}
		
		for(int i=0; i<n-1;i++)
		{
			if(s.charAt(i)== s.charAt(i+1))
			{
				dp[i][i+1]=true;
				start=i;
				maxlength=2;
			}
		}
		
		for(int length=3; length <=n; length++)
		{
			for(int i=0; i < n-length + 1;i++)
			{
				int j=i+ length -1;
				
				if(dp[i +1][j-1] && s.charAt(i) == s.charAt(j))
				{
					dp[i][j]=true;
					start=i;
					maxlength=length;
				}
			}
		}
		
		return s.substring(start, start + maxlength);
	}

}
