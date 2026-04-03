package day2;

import java.util.Scanner;

public class Count {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(counnt(n));
	}

	static int c=0;
	
	private static int counnt(int n) {
		if(n!=0)
		{
			c++;
			counnt(n/10);
		}
		return (c!=0)?c:1;
		
	}
}
