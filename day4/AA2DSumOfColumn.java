package day4;

import java.util.Scanner;

public class AA2DSumOfColumn {

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
		SumOfColumn(arr);
	}

	private static void SumOfColumn(int[][] arr) {
		
		for(int j=0;j<arr.length;j++)
		{
			int sum=0;
			for(int i=0;i<arr.length;i++)
			{
				sum+=arr[i][j];
			}
			System.out.println("Sum of Column "+j+":"+sum);
		}
		
	}
}
