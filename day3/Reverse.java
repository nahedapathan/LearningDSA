package day3;

import java.util.Scanner;

class Demo1
{
	static String strrev(String s)
	{
		if(s==null || s.length()<=1)
		{
			return s;
		}
		return strrev(s.substring(1))+s.charAt(0);
	}
}
public class Reverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String  :");
		String s=sc.nextLine();
		System.out.println(Demo1.strrev(s));
	}
}
