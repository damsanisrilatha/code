package coding;

public class RepeatedChar {

	public static void main(String[] args) {
		String str="SRILATHAIS";
		char[] a=str.toCharArray();
		for(int i=0;i<=a.length-1;i++)
		{
		char current=a[i];
		 int count=0;
		for(int j=0;j<=a.length-1;j++)
		{
			if(current==a[j])
		{
			count++;
		}
			// TODO Auto-generated method stub
		}
		if(count>1){
			System.out.println(current+"===============>"+count);
		}
	}

}
}
