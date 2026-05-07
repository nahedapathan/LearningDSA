package Day12Array;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum {
	
	public static List<List<Integer>> threeSum(int[] nums,int target)
	{
		int n=nums.length;
		Set<List<Integer>> output=new HashSet<>();
		for(int i=0;i<n-2;i++)
		{
			for(int j=i+1;j<n-1;j++)
			{
				for(int k=j+1;k<n;k++)
				{
					if(nums[i]+nums[j]+nums[k]==target)
					{
						List<Integer> temp=new ArrayList<>();
						temp.add(nums[i]);
						temp.add(nums[j]);
						temp.add(nums[k]);
						Collections.sort(temp);
						output.add(temp);
						
					}
				}
			}
		}
		return new ArrayList<>(output);
	}

	public static void main(String[] args) {
		
		int arr[]= {1,2,4,5,7};
		List<List<Integer>> ans=threeSum(arr, 8);
		for(List<Integer> i:ans)
		{
			System.out.println(i);
		}
	}
}
