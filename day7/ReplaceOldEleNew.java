package day7;

import java.util.Scanner;

public class ReplaceOldEleNew {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of Ele :");
		int size=sc.nextInt();
		
		int []arr=new int[size];
		int i;
		System.out.println("Enter the Element of Array :");
		for(i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int oldele,newele;
		System.out.println("Enter the old ele ");
		oldele=sc.nextInt();
		
		System.out.println("Enter the new ele :");
		newele=sc.nextInt();
		
		for(i=0;i<arr.length;i++)
		{
			if(oldele==arr[i])
			{
				arr[i]=newele;
			}
		}
		
		System.out.println("Output of Element");
		for(i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
