package day10Array;

import java.util.HashSet;
import java.util.Set;

public class intersectionOfArray {

	static Set<Integer> findIntersection(int[] arr1,int[] arr2)
	{
		Set<Integer> set=new HashSet<Integer>();
		Set<Integer> result=new HashSet<Integer>();
		for(int num:arr1)
		{
			set.add(num);
		}
		
		for(int num:arr2)
		{
		     if(set.contains(num))
		     {
		    	 result.add(num);
		     }
		}
		return result;
	}
	
	public static void main(String[] args) {
		int[] arr= {1,2,5,3,7};
		int[] arr2= {4,5,1,2,6};
		Set<Integer> intersect=findIntersection(arr, arr2);
		System.out.println("Intersection :"+intersect);
	}
	
	
}
