package Programs;

public class Fibonacci {
	
	static int a=0,b=1;
	static int c;
	
	static void Fibonacci(int count)
	{
		
		for(int i=0;i<=count;i++)
		{
		
			c=a+b;
			a=b;
			b=c;
			System.out.print(" "+c);	
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(a+" "+b);
      Fibonacci(10);
      
      
	}

}
