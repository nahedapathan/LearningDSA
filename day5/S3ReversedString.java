package day5;

public class S3ReversedString {

	public static void main(String[] args) {
		String str="code";
		String reversed="";
		for(int i=str.length()-1;i>=0;i--)
		{
			reversed=reversed+str.charAt(i);
		}
		System.out.println(reversed);
	}
}
