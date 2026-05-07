package Day12Array;

public class RemoveDuplicatFromSortedArray {
//yae duplicate element komremove karkae array length dera hai
	
	public static int removeDuplicate(int arr[])
	{
		int i=0;
		int j=1;
		int n=arr.length;
		while(j<n)
		{
			if(arr[i]==arr[j])
			{
				j++;
			}
			else
			{
				i++;
				arr[i]=arr[j];
				j++;
			}
		}
		return i+1;
	}
	
	
	public static void main(String[] args) {
		
		int arr[]= {1,2,2,3,4,5,6};
		int ans=removeDuplicate(arr);
		System.out.println(ans);
	}
}
