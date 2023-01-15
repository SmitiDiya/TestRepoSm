package Programs;

public class PalindromeCheck {
	String original="sos";
	   String reverse="";
	   
	   void palindrome()
	   {
	   for(int i=original.length()-1;i>=0;i--)
	   {
		   reverse=reverse+original.charAt(i);
	   }
	   if(original.equals(reverse))
	   {
		   System.out.println("it is palindrome");
	   }
	   
	   else
	   {
		   System.out.println("it is not a palindrome");
	   }
	   }
	   
	   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PalindromeCheck p=new PalindromeCheck();
		p.palindrome();
   
   
	}

}
