package Programs;

public class FibonacciSeries {
	
	static int a=0,b=1;
	static int c,count=0;
	
	static void Fibonacci(int count)

	{
		
		for(int i=0;i<count;i++)
		{
			c=a+b;  
			a=b;    
			b=c;    
			
			System.out.print("  "+c);	
		}
		
	}
	
	public static void main(String[] args)
	{
		System.out.print(a+" "+b);
		Fibonacci(10);
	}
}
