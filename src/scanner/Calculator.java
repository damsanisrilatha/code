package scanner;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		boolean repeat=true;
		System.out.println("******Welcome to Srilatha Calculators!!!******");
		while(repeat){
			System.out.println("enter value of x:");
			//System.out.println("enter value of y:");
			Scanner s=new Scanner(System.in);
			int x=s.nextInt();
			System.out.println("enter value of y:");
			int y=s.nextInt();
			int result;
			System.out.println("enter an operator(+,-,*,/,%):");
			char operators=s.next().charAt(0);
			
			switch(operators)
			{
			case '+':
				result=x+y;
				System.out.println(result);
				break;
			case '-':
				result=x-y;
				System.out.println(result);
				break;
			case'*':
				result=x*y;
				System.out.println(result);
				break;
			case'/':
				result=x/y;
				System.out.println(result);
				break;
			case'%':
				result=x%y;
				System.out.println(result);
				break;
			default:
				System.out.println("invalid  input");
				return;
			}
			System.out.println("Do you want to continue???(yes/no)");
			String str=s.next();
			if(str.equals("yes")){
				repeat=true;
			}
			else{
				repeat=false;
			}
		}
	}

}
