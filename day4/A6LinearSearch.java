package day4;

import java.util.Scanner;

public class A6LinearSearch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Size of Array :");
		int n=sc.nextInt();
		
		int[] arr=new int[n];
		
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		System.out.println("Enter Element Search ");
		int searchele=sc.nextInt();
		
		boolean searcch=search(arr,searchele);
		if(searcch)
		{
			System.out.println("Found Element");
		}
		else
		{
			System.out.println("Not Found Element");
		}
	}

	private static boolean search(int[] arr, int searchele) {
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==searchele)
			{
				return true;
			}
		}
		return false;
	}
}
