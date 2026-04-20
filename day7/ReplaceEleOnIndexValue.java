package day7;

import java.util.Scanner;

public class ReplaceEleOnIndexValue {

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
		
		int index,newele;
		System.out.println("Enter the index ele ");
	    index=sc.nextInt();
		
		System.out.println("Enter the new ele :");
		newele=sc.nextInt();
		
		if(index>=0 && index<arr.length)
		{
			arr[index]=newele;
		}
		else
		{
			System.out.println("Array Index OUt of Bound Exception");
		}
		
		System.out.println("Output of Element");
		for(i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
