package day9Array01;

public class MultiplyBy10 {

	static int[] multiplyBy10(int[] arr)
	{
		int size=arr.length;
		int[] newArr=new int[size];
		for(int i=0;i<size;i++)
		{
			int ele=arr[i];
			int newEle=ele*10;
			newArr[i]=newEle;
		}
		return newArr;
	}
	
	public static void main(String[] args) {
		
		int[] arr= {2,4,5,3};
		int[] ans=multiplyBy10(arr);
		for(int i:ans)
		{
			System.out.print(i+" ");
		}
	}
}
