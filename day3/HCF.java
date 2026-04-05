package day3;

import java.util.Scanner;

class Test
{
	static int hcf(int a,int b)
	{
		while(a!=b)
		{
			if(a>b)
			{
				return hcf(a-b,b);
			}
			else
			{
				return hcf(a,b-a);
			}
		}
		return a;
	}
}
public class HCF {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st Number :");
		int a=sc.nextInt();
		System.out.println("Enter the 2st Number :");
		int b=sc.nextInt();
		System.out.println(Test.hcf(a, b));
	}
}
