package day10Array;

public class ReverseArray {

	static int[] reverseArray(int[] arr)
	{
		int n=arr.length-1;
		for(int i=0;i<n/2;i++)
		{
			int ele=arr[i];
			arr[i]=arr[n-i];
			arr[n-i]=ele;
			
		}
		return arr;		
	
	}
	
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		int ans[]=reverseArray(arr);
		for(int i:ans)
		{
			System.out.print(i+" ");
		}
	}
}
