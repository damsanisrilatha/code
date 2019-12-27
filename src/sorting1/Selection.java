package sorting1;

public class Selection {
	public static void sort(int[] a)
	{
		for(int i=0;i<a.length-1;i++)
		{
			int index=i;
			for(int j=i+1;j<a.length;j++)
			{
			if(a[j]<a[index])
				index=j;

			}
			if(i!=a[index])
			{
				int temp=a[index];
				a[index]=a[i];
				a[i]=temp;
			}
		}
	
	}

	public static void main(String[] args) {
		int[] arr={3,6,8,4,1};
		sort(arr);
		for(int n:arr)
			System.out.println(n);
			
		
		
		
		
	}

}
