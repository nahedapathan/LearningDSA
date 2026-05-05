package Day11Array;

public class MissingNumber {

	static int missingNumber(int[] nums)
	{
		int n=nums.length;
		int xorSum=0;
		for(int i:nums)
		{
			xorSum=xorSum^i;
		}
		
		for(int i=0;i<=n;i++)
		{
			xorSum=xorSum^i;
		}
		return xorSum;
	}
	
	public static void main(String[] args) {
		int arr[]= {0,2,3};
		System.out.println(missingNumber(arr));
	}
}
