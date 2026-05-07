package day9Array01;

public class SwapAlternateExtremeElementArray {

	static int[] swapEndElement(int[] arr)
	{
		for(int i=0;i<arr.length/2;i++)
		{
			int ele=arr[i];
			arr[i]=arr[arr.length-1-i];
			arr[arr.length-1-i]=ele;
		}
		
		return arr;
	}
	
	public static void main(String[] args) {
		int[] arr= {8,9,1,4,5,6};
		int[] ans=swapEndElement(arr);
		for(int i:ans)
		{
			System.out.print(i+" ");
		}
	}
}
