package Programs;

public class PalindromeNumber {
	public static void main(String[] args) {
	  int r,sum=0,temp; 
      int n=4345;
	temp=n;
	
	while(n>0)
	{
		r=n%10;
		sum=(sum*10)+r;
		n=n/10;
		System.out.println(sum+"  "+n+"  "+temp);
		
		
		
	}
	if(temp==sum)
	{
		System.out.println("it is palindrome");
	}else
	{
		System.out.println("it is not a palindrome");
	}
	}
	
	

}
