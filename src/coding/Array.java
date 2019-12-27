package coding;
public class Array {

	public static void main(String[] args) {
		int[] a={2,4,7,8,9,4};
		int count=1;
		for(int i=0;i<=a.length-1; i=i+2)
		{
			//count=count+a[i];
			count=count*a[i];
			//System.out.println(count);
		}
		// TODO Auto-generated method stub
		System.out.println(count);
	
	}

}
