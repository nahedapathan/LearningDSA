package day3;

import java.util.Scanner;

class Test2
{
	static int com=1;
	static int lcm(int n1,int n2)
	{
		if(com%n1==0 && com%n2==0)
		{
			return com;
		}
		com++;
		lcm(n1,n2);
		return com;
	}
}
public class LCM {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the 1st Number :");
		int a=sc.nextInt();
		System.out.println("Enter the 2st Number :");
		int b=sc.nextInt();
		System.out.println(Test2.lcm(a, b));
	}
}
