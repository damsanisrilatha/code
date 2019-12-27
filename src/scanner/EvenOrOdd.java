package scanner;
import java.util.Scanner;
public class EvenOrOdd {

	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		if(n%2==0)
		{
			System.out.println("even number="+n);
		}
		else{
			System.out.println("odd number="+n);
		}
		}
		// TODO Auto-generated method stub

	}

