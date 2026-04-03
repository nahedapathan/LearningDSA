package day2;

import java.util.Scanner;

class Demo
{
	static void print(int n)
	{
		if(n>=0)
		{
			System.out.print(n+" ");
			print(n-1);
			System.out.print(n+" ");
		}
	}
}
public class PrintNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		Demo.print(n);
		
	}
}
