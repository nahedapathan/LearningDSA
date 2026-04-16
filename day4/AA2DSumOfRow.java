package day4;

import java.util.Scanner;

public class AA2DSumOfRow {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Size of Array :");
		int n=sc.nextInt();
		
		System.out.println("Enter the Element :");
		int[][] arr=new int[n][n];
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		
		sumOfRow(arr);
		
	}

	private static void sumOfRow(int[][] arr) {
		
		for(int i=0;i<arr.length;i++)
		{
			int sum=0;
			for(int j=0;j<arr.length;j++)
			{
				sum+=arr[i][j];
			}
			System.out.println("Sum of row"+i+":"+sum);
		}
		
	}
}
