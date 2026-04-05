package day3;

import java.util.Scanner;

class Demo
{
	static String myString(String s,int index)
	{
		if(index<0)
		{
			return "";
		}
		else if(s.charAt(index)=='x')
		{
			return myString(s,index-1);
		}
		else
		{
			return myString(s,index-1)+s.charAt(index);
		}
	}
}
public class RemovecharacterX {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String :");
		String s=sc.nextLine();
		System.out.println(Demo.myString(s,s.length()-1));
	}
}
