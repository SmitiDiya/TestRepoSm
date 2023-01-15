package Programs;

public class Palindrome {
	
	static String original="madam";
	String reverse="";
	
 void checkPalindrome()
{
  int orglen=original.length();
  for(int i=orglen-1;i>=0;i--) {
	  
	  reverse=reverse+original.charAt(i);
  }
  
  
  if(original.equals(reverse))
  {
  System.out.println("it is palindrome");
}
  else
  {
	  System.out.println("it is not palindrome");  
  }
}
 public static void main(String[] args)
 
 {
	 
	 Palindrome	 p=new Palindrome();
	 p.checkPalindrome();
 } 
 }
  
  
