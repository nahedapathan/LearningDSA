package day2;

import java.util.Scanner;

class Demo3{
	static int power(int a,int b)
	{
		if(b>=1)
		{
			return a*power(a,b);
		}
		else
		{
			return 1;
		}
	}
}

public class APowerB {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println(Demo3.power(a,b));
	}
}
