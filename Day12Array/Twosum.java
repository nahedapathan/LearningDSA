package Day12Array;

public class Twosum {
	
	public static int[] twoSum(int[] nums,int target)
	{
		int n=nums.length;
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(nums[i]+nums[j]==target)
				{
					int ans[]= {i,j};
					return ans;
				}
			}
		}
		int ans[]= {};
		return ans;
	}

	public static void main(String[] args) {
		int arr[]= {1,2,4,5,6,8};
		int ans[]=twoSum(arr, 5);
		System.out.println(ans[0]+" "+ans[1]);
	}
}
