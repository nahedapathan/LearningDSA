package Day12Array;

import java.util.HashMap;

public class findFirstRepeatingelement {

	public static int findFirstReplacingEle(int[] arr)
	{
		HashMap<Integer, Integer> freq=new HashMap<Integer, Integer>();
		for(int num:arr)
		{
			freq.put(num,freq.getOrDefault(num, 0)+1);
		}
		
		for(int i:arr)
		{
			if(freq.get(i)>1)
			{
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		
		int arr[]= {1,5,4,5,9,8,8,8,6};
		int ans=findFirstReplacingEle(arr);
		System.out.println(ans);
	}
}
