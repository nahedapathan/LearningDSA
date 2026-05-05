package Day11Array;

public class FindUniqueElementinArray {

	static int findUnique(int[] nums)
	{
		int xorSum=0;
		for(int n:nums)
		{
			xorSum=xorSum^n;
			
		}
		return xorSum;
	}
	
	public static void main(String[] args) {
		int arr[]= {2,5,4,2,5,4,3};
		System.out.println(findUnique(arr));
	}
}
