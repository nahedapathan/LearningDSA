package day2;

import java.util.Scanner;
class Demo5
{
	static int fact(int n)
	{
		if(n==0)
		{
			return n=1;
		}
		else
		{
			return n*fact(n-1);
		}
	}
}

public class factorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(Demo5.fact(n));
	}
}
