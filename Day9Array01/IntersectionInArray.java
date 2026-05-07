package day9Array01;

public class IntersectionInArray {
	
	static int[] intersectionElement(int[] arr1,int[] arr2)
	{
		int count=0;
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				if(arr1[i]==arr2[j])
				{
					count++;
				}
			}
		}
		
		int ans[]=new int[count];
		int index=0;
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				if(arr1[i]==arr2[j])
				{
					ans[index]=arr1[i];
					index++;
				}
			}
		}
		
		return ans;
		
	}

	public static void main(String[] args) {
		
		int arr1[]= {2,5,4,8,3,9};
		int arr2[]= {6,4,2,3,9};
		int ans[]=intersectionElement(arr1, arr2);
		for(int i:ans)
		{
			System.out.print(i+" ");
		}
	}
}
