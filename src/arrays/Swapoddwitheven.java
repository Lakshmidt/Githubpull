package arrays;

import java.util.Arrays;

public class Swapoddwitheven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,4,5,6,8,7,9,1};
		int t=0;
		for(int i=0;i<a.length;i++)
		{
			if(i%2!=0 && (i+1)<a.length)
			{
				t=a[i];
				a[i]=a[i+1];
				a[i+1]=t;
			}
		}
		System.out.println(Arrays.toString(a));
		
	}

}
