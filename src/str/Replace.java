package str;

public class Replace {

	public static void main(String[] args) {
		String s1="javascript";
		//String s2=s1.replace('a', '@');
		s1.replace("a", " ").length();
		int n =s1.length()-s1.replace("a", " ").length();;
		System.out.println(n);
	}

}
