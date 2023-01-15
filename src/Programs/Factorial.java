package Programs;

public class Factorial {
	
	int fact=1;
	
	void Facto(int n)
	{
	for(int i=n;i>=1;i--)
		
	{
		
   fact=fact*i;
   	
}
	System.out.println(fact);	
}
	
	public static void main(String[] args)
	
	{
		Factorial f=new Factorial();
		f.Facto(6);
		
	}
}	
	
