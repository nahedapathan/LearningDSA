package day2;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value n :");
		int n=sc.nextInt();
		System.out.println(isprime(n,n/2));
	}

	static boolean isprime(int n, int i) {
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
			return isprime(n,--i);
		}
	}
}
