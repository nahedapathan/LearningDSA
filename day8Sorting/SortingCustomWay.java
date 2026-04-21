package day8Sorting;

import java.util.Scanner;

public class SortingCustomWay {

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
		
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(arr[i]>arr[j])
				{
					t=arr[i];
					arr[i]=arr[j];
					arr[j]=t;
				}
			}
		}
		
		System.out.println("Result :");
		for(i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
