package day2;

import java.util.Scanner;

class Demo2
{
	static int sum(int n)
	{
		if(n==1)
		{
			return 1;
		}
		else
		{
			return n+sum(n-1);
		}
	}
}
public class SumOfNaturalNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number :");
		int n=sc.nextInt();
		System.out.println(Demo2.sum(n));
	}
}
