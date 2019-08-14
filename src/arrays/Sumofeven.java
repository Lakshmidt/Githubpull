package arrays;

public class Sumofeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		int sum=0,t=a[0];
		//sum of even index values
		for(int i=0;i<a.length;i+=2)
			sum+=a[i];
		System.out.println(sum);
		sum=0;
		//sum of even index values
		for(int i=1;i<a.length;i+=2)
			sum+=a[i];
		System.out.println(sum);	
		//min of even index
		for(int i=0;i<a.length;i+=2)
		{
			if(t>a[i])
				t=a[i];
		}
		System.out.println(t);
		//max of even index
		t=a[0];
		for(int i=0;i<a.length;i+=2)
		{
			if(t<a[i])
				t=a[i];
		}
		System.out.println(t);
		//min of odd index
		t=a[1];
		for(int i=1;i<a.length;i+=2)
		{
			if(t>a[i])
				t=a[i];
		}
		System.out.println(t);
		//max of odd index
		t=a[1];
		for(int i=1;i<a.length;i+=2)
		{
			if(t<a[i])
				t=a[i];
		}
		System.out.println(t);
	}

}
