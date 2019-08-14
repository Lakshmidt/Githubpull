package arrays;

public class Avgofarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(avg(1,3,7,9));
	}
	static int avg(int ...a )
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
			sum+=a[i];
		return sum/a.length;
	}

}
