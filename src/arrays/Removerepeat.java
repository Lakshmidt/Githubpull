package arrays;

import java.util.ArrayList;

public class Removerepeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,9,7,1,2,3,2,1,3};	
		ArrayList lst=new ArrayList();
		for(int i=0;i<a.length;i++)
		{
			boolean b=false;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]!=a[j])
				{
					b=true;
					break;
				}
				else
				{
					b=false;
				}
			}
			if(b)
				lst.add(a[i]);
		}
		System.out.println(lst);
	}

}
