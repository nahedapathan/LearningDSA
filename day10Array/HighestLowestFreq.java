package day10Array;

import java.util.HashMap;

public class HighestLowestFreq {

	static int[] getHighestLowest(int arr[])
	{
		HashMap<Integer, Integer> freq=new HashMap<>();
		for(int num:arr)
		{
			freq.put(num, freq.getOrDefault(num, 0)+1);
			
		}
		int highestfreq=Integer.MIN_VALUE;
		int highestNum=-1;
		for(int key:freq.keySet())
		{
			int currentkey=key;
			int currentfreq=freq.get(key);
			if(currentfreq>highestfreq)
			{
				highestfreq=currentfreq;
				highestNum=currentkey;
			}
		}
		int lowestfreq=Integer.MAX_VALUE;
		int lowestNum=-1;
		for(int key:freq.keySet())
		{
			int currentkey=key;
			int currentfreq=freq.get(key);
			if(currentfreq< lowestfreq)
			{
				lowestfreq=currentfreq;
				lowestNum=currentkey;
			}
			
		}
		
		int ans[]= {highestNum,lowestNum};
		return ans;
		
	}
	
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,4,5,3};
		int ans[]=getHighestLowest(arr);
		System.out.println("Highesst :"+ans[0]);
		System.out.println("Lowest :"+ans[1]);
	}
}
