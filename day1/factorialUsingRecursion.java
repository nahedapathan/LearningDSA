package day1;

import java.util.Scanner;

public class factorialUsingRecursion {
	
	public static int factorial(int n)
	{
		if(n==1)
		{
			return 1;
		}
		else
		{
			return n*factorial(n-1);
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number :");
		int n=sc.nextInt();
		int fact=factorial(n);
		System.out.println("factorial of the number is :"+fact);
	}

	
}
