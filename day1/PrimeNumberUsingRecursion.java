package day1;

import java.util.Scanner;

public class PrimeNumberUsingRecursion {
	
	public static boolean isPrime(int n,int i)
	{
		if(i==1)
		{
			return true;
		}
		else if(n%i==0)
		{
			return false;
		}
		else
		{
			return isPrime(n,--i);
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Prime Number :");
		int n=sc.nextInt();
		
		boolean prime=isPrime(n,n/2);
		if(prime)
		{
			System.out.println("Prime number "+n);
		}
		else
		{
			System.out.println("Not Prime Number "+n);
		}
	}
}
