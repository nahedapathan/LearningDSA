package Day9Array01;

public class SwapAlternateElementinArray {

	static int[] swapAlternate(int arr[])
	{
	    for(int i=0;i<arr.length;i=i+2)
	    {
	    	int ele=arr[i];
	    	arr[i]=arr[i+1];
	    	arr[i+1]=ele;
	    }
	    
	    return arr;
	}
	
	public static void main(String[] args) {
		int arr[]= {2,5,8,9,4,1};
		int ans[]=swapAlternate(arr);
		for(int i:ans)
		{
			System.out.print(i+" ");
		}
	}
}
