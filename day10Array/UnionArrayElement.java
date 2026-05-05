package day10Array;

import java.util.HashSet;
import java.util.Set;

public class UnionArrayElement {

	static Set<Integer> findUnion(int[] arr1,int[] arr2)
	{
		Set<Integer> set=new HashSet<Integer>();
		for(int num:arr1)
		{
			set.add(num);
		}
		
		for(int num:arr2)
		{
			set.add(num);
		}
		return set;
	}
	
	
	public static void main(String[] args) {
		
		int[] arr1= {1,2,5,6,3,2};
		int[] arr2= {8,9,6,5,3,2};
		Set<Integer> result=findUnion(arr1, arr2);
		System.out.println("union of Array :"+result);
	}
}
