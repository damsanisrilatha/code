package sorting1;

public class Insertion {
	public static void sort(int[]a)
	{
		for(int i=1;i<a.length;i++)
		{
			int key=a[i];
			int j=i-1;
			while(j>=0&&a[j]>key)
			{
				a[j+1]=a[j];
				j--;
				
			}
			a[j+1]=key;
		}
	}

	public static void main(String[] args) {
		int []arr={5,3,8,2,4,7};
		sort(arr);
		for(int n:arr)
			System.out.println(n);
		
	}

}
