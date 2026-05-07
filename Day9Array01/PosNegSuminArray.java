package day9Array01;

public class PosNegSuminArray {

	static int[] posNegSum(int[] arr)
	{
		int posSum=0;
		int negSum=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>0)
			{
				posSum=posSum+arr[i];
			}
			else
			{
				negSum=negSum+arr[i];
			}
		}
		int ans[]= {posSum,negSum};
		return ans;
	}
	
	public static void main(String[] args) {
		{
			int arr[]={2,-3,5,4,-2};
			int ans[]=posNegSum(arr);
			System.out.println("PosSum :"+ans[0]);
			System.out.println("NegSum :"+ans[1]);
			
		}
	}
}
