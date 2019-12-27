package coding;

public class MaxNumber {

	public static void main(String[] args) {
		int[] array={2,5,9,20,6,21};
		int max=0;
		for(int i=0;i<=array.length-1;i++)	
		{
			if(max<array[i])
		
			{
			max=array[i];
	
			}
			
		}
		
		System.out.print("max in the array="+max);
		
		// TODO Auto-generated method stub

	}

}
