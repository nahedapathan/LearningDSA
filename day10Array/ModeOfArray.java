package day10Array;

import java.util.HashMap;

public class ModeOfArray {
	static int getMode(int[] arr)
	{
		HashMap<Integer,Integer> freq=new HashMap<>();
		for(int num:arr)
		{
			freq.put(num, freq.getOrDefault(num, 0)+1);
		}
		int maxfreq=-1;
		int maxfreqwalikey=-1;
		
		for(int key:freq.keySet())
		{
			int currentkey=key;
			int currentkeykifrequency=freq.get(key);
			if(currentkeykifrequency>maxfreq)
			{
				maxfreq=currentkeykifrequency;
				maxfreqwalikey=currentkey;
			}
		}
		return maxfreqwalikey;
	}
	public static void main(String[] args) {
		
		int arr[]= {1,2,1,1,2,3,4,4,4,4,5,5};
		int ans=getMode(arr);
		System.out.println(ans);
	}
}
