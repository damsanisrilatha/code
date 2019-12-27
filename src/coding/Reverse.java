package coding;

public class Reverse {

	public static void main(String[] args) {
		String str="SRILATHADAMSANI";
		char[] array=str.toCharArray();
		char[] reverse=new char[str.length()];
		int i=0;
		for(int j=array.length-1;j>=0;j--)
		{
			reverse[i]=array[j];
			i++;
		}
		
		
		for(int k=0; k<reverse.length;k++){
			System.out.print(reverse[k]);
		}
		// TODO Auto-generated method stub

	}

}
