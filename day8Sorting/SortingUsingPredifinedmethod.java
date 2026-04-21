package day8Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class SortingUsingPredifinedmethod {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of Array :");
		int i,j,t, n=sc.nextInt();
		
		int []arr=new int[n];
		System.out.println("enter"+n+"elements :");
		for(i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		System.out.println("Result :");
		for(i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
