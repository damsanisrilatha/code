package scanner;
import java.util.Scanner;
public class NumOfDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter month and year");
		Scanner s=new Scanner(System.in);
		int m=s.nextInt();
		int y=s.nextInt();
		switch(m)
		{
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:System.out.println("31 days");
		break;
		case 4:
		case 6:
		case 9:
		case 11:System.out.println("30 days");	
		if((y%400==0)||(y%4==0)&&(y%100!=0))
		{
			System.out.println("29 days");
		}
			else
				{
				System.out.println("28 days");
			break;}
			default:System.out.println("invalid input");
		}
		}
	}