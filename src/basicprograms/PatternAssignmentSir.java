package basicprograms;

public class PatternAssignmentSir {

	public static void main(String[] args)
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if((i+j)%2==0)
					System.out.print("*");
				else
					System.out.print("_");
				
			}
			System.out.println();
		}
		//System.out.println();
	}
}
