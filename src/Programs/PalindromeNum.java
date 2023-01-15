package Programs;

public class PalindromeNum {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int orig=4554,rev;
		int temp,r,n=0;
		temp=orig;
		
	
			while(orig>0)
			{
			r=orig%10;
			n=(n*10)+r;
			orig=orig/10;
			
			}
			
			if(temp==n)
			{
				System.out.println("It is a palindrome");
			}
			else
			
			{
				System.out.println("It is not a palindrome");
			}
		}
	}


