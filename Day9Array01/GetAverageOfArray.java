package Day9Array01;

public class GetAverageOfArray {
	
	static double getAverage(int[] arr)
	{
		int sum=0;
		for(int i:arr)
		{
			sum +=i;
			arr[i]=arr[i]*10;
		}
		int size=arr.length;
		
		double average=sum/size;
		
		return average;
		
	}

	public static void main(String[] args) {
		int[] arr= {2,5,3,3};
		System.out.println(getAverage(arr));
		
	}
}
