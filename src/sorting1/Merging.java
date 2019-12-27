package sorting1;

public class Merging {
	static void merge(int[] a,int[] b,int[] c)
	{
		int i=0,j=0,k=0;
		while(i<a.length&&j<b.length)
		
		if(a[i]<a[j])
		{
			c[k]=a[i];
			i++;
			k++;
		}
		else
		{
			c[k]=a[j];
			j++;
			k++;
		}
	
		
	while(i<a.length){
		c[k]=a[i];
		i++;
		k++;
	}
	while(j<b.length){
		c[k]=b[j];
		j++;
		k++;
	}
	}

	public static void main(String[] args) {
		int [] a={2,4,5,7};
		int [] b={3,6,8,10};
		int [] c= new int[a.length+b.length];
		merge(a,b,c);
		for(int c1:n
				)
			System.out.println(n);
		
	}

}
