package day2;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		String s=sc.nextLine();
		System.out.println(reverse(Integer.parseInt(s),s.length()));
	}

	private static int reverse(int n, int len) {
		if(n==0)
			return 0;
		else
			return((n%10)*(int)Math.pow(10, len-1))+reverse(n/10,--len);
	}
}
