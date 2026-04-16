package day4;

import java.util.Scanner;

public class A4MinimumArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Size of Array :");
		int n=sc.nextInt();
		
		int[] arr=new int[n];
		
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		System.out.println("Minimum of Array :"+min);
	}
}
