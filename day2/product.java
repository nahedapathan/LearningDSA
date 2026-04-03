package day2;

import java.util.Scanner;

public class product {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value a :");
		int a=sc.nextInt();
		System.out.println("Enter the value b :");
		int b=sc.nextInt();
		System.out.println(product(a,b));
	}

	private static int product(int a, int b) {
		
		if(a<b) 
			return product(b,a);
		else if(b!=0)
			return a+product(a,b-1);
		else
			return 0;
	}
}
