package Programs;

public class PrimeNumberCheck {
	
	static int temp=0;
	
	
	static void Prime(int num)
	{
		for(int i=2;i<=num;i++)
		{
			if((num%i)==0)
			{
				temp=temp+1;
			}
		}
		if(temp>1)
		{
			System.out.println("number is not primenumber");
		}
		else
		{
			System.out.println("number is a primenumber");	
		}
	}
	
	public static void main(String[] args)
	
	{
    Prime(8);
}
}
