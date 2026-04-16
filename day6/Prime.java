package day6;

public class Prime {

	public static void main(String[] args) {
		int n=13;
		boolean isprime=true;
		
		if(n<=1)
		{
			isprime=false;
		}
		else
		{
			for(int i=2;i<n;i++)
			{
				if(n%i==0)
				{
					isprime=false;
					break;
				}
			}
		}
		if(isprime)
		{
			System.out.println("Prime Number");
		}
		else
		{
			System.out.println("Not Prime number");
		}
	}
}
