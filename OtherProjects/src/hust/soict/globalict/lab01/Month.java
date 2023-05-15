package hust.soict.globalict.lab01;
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
			case "March":
			case "Mar.":
			case "Mar":
			case "3":
			case "May":
			case "5":
			case "July":
			case "Jul":
			case "7":
			case "August":
			case "Aug.":
			case "Aug":
			case "8":
			case "October":
			case "Oct.":
			case "Oct":
			case "10":
			case "December":
			case "Dec.":
			case "Dec":
			case "12":
				System.out.println("This month has 31 days.");
				break;
			case "February":
			case "Feb.":
			case "Feb":
			case "2":
				// Check if year is leap or not
				if(year%4 != 0) leap = 0;
				else if(year%100 == 0 && year%400 != 0) leap = 0;
				else leap = 1;
				
				if(leap == 1) System.out.println("This month has 29 days.");
				else System.out.println("This month has 28 days.");
				break;
			case "April":
			case "Apr.":
			case "Apr":
			case "4":
			case "June":
			case "Jun":
			case "6":
			case "September":
			case "Sept.":
			case "Sep":
			case "9":
			case "November":
			case "Nov.":
			case "Nov":
			case "11":
				System.out.println("This month has 30 days.");
				break;
			default:
				System.out.println("Unvalid month. Please input again.");
				continue;
			}
			break;
		}
		while(true);
	}
}
