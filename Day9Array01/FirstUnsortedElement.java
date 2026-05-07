package day9Array01;

public class FirstUnsortedElement {

	static int getUnsortedElement(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i+1]<=arr[i])
			{
				return arr[i+1];
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int arr[]= {1,2,3,5,4};
		System.out.println(getUnsortedElement(arr));
	}
}
