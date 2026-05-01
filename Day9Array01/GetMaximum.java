package Day9Array01;

public class GetMaximum {

	static int getMaximum(int[] arr)
	{
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		int[] arr= {4,25,7,1};
		System.out.println(getMaximum(arr));
		}
}
