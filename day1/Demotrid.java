package day1;

import java.util.ArrayList;

public class Demotrid {

	public static ArrayList<Integer> tribonnaci(int n)
	{
		int a,b,c,d,i;
		ArrayList<Integer> al=new ArrayList<Integer>();
		a=0;
		b=1;
		c=2;
		al.add(a);
		al.add(b);
		al.add(c);
		for(i=1;i<=n-3;i++)
		{
			d=a+b+c;
			al.add(d);
			a=b;
			b=c;
			c=d;
		}
		return al;
	}

}
