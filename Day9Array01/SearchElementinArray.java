package day9Array01;

public class SearchElementinArray {

	static boolean findTarget(int[] arr,int search)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==search)
			{
				return true;
			}
		}
		return false;
		
	}
	public static void main(String[] args) {
		
		int[] arr= {5,4,3,2};
		int search=3;
		boolean ans=findTarget(arr,search);
		System.out.println(ans);
	}
}
