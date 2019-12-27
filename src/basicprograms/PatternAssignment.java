package basicprograms;

public class PatternAssignment {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			char currentchar;
			if(i%2!=0){
				currentchar='*';
			}
			else
			{
				currentchar='_';
			}
			System.out.println("");
			for(int j=1;j<=5;j++)
			{
				System.out.print(currentchar);
				if(currentchar=='_')
				{
					currentchar='*';
				}
				else
				{
					currentchar='_';
				}
			}
		}
	}
					
}


