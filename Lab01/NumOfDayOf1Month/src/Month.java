import java.util.Scanner;
public class Month {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int year, leap;
		float year_check;
		String month;
		
		do {
			// Input year
			System.out.println("Input year: ");
			year_check = keyboard.nextFloat();
			if(year_check%1 != 0 || year_check<0) {
				System.out.println("Unvalid year. Please input again.");
				continue;
			}
			year = (int) year_check;
			
			// Check if year is leap or not
			if(year%4 != 0) leap = 0;
			else if(year%100 == 0 && year%400 != 0) leap = 0;
			else leap = 1;
			
			// Input month
			System.out.println("Input month: ");
			keyboard.nextLine();
			month = keyboard.nextLine();
			
			// Check month
			switch(month) {
			case "January":
			case "Jan.":
			case "Jan":
			case "1":
				System.out.println("This month has 31 days.");
				break;
			case "January":
			case "Jan.":
			case "Jan":
			case "1":
				System.out.println("This month has 31 days.");
				break;
			case "January":
			case "Jan.":
			case "Jan":
			case "1":
				System.out.println("This month has 31 days.");
				break;
			case "January":
			case "Jan.":
			case "Jan":
			case "1":
				System.out.println("This month has 31 days.");
				break;
			case "January":
			case "Jan.":
			case "Jan":
			case "1":
				System.out.println("This month has 31 days.");
				break;
			case "January":
			case "Jan.":
			case "Jan":
			case "1":
				System.out.println("This month has 31 days.");
				break;
			case "January":
			case "Jan.":
			case "Jan":
			case "1":
				System.out.println("This month has 31 days.");
				break;
			case "January":
			case "Jan.":
			case "Jan":
			case "1":
				System.out.println("This month has 31 days.");
				break;
			case "January":
			case "Jan.":
			case "Jan":
			case "1":
				System.out.println("This month has 31 days.");
				break;
			case "January":
			case "Jan.":
			case "Jan":
			case "1":
				System.out.println("This month has 31 days.");
				break;
			case "January":
			case "Jan.":
			case "Jan":
			case "1":
				System.out.println("This month has 31 days.");
				break;
			case "January":
			case "Jan.":
			case "Jan":
			case "1":
				System.out.println("This month has 31 days.");
				break;
			default:
				System.out.println("Unvalid month. Please input again.");
				continue;
				break;
			}
			
			break;
		}
		while(true);
	}
}
