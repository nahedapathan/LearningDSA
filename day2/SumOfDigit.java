package day2;

import java.util.Scanner;

public class SumOfDigit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value n :");
		int n=sc.nextInt();
		System.out.println(sumOfdigit(n));
	}

	private static int sumOfdigit(int n) {
	
		if(n==0)
		{
			return 0;
		}
		else
		{
			return (n%10)+sumOfdigit(n/10);
		}
	}
}
