package Programs;

public class PrimeNumber {
	
	static int temp=0;
	
	static void Prime(int n)
	{
		int i;
    for(i=2;i<=n;i++)
			
		{
			if((n%i)==0)
			{
				temp=temp+1;
				
			}
		}
			
			if(temp>1)
			{
				System.out.println("is not a prime number");
			}
			else
			{
				System.out.println("is prime number");
		}
		
	
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Prime(10);
	}

}
