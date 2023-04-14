import java.util.Scanner;
import javax.swing.JOptionPane;
//Ex2.2.6
public class Solve {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String c;
		c = JOptionPane.showInputDialog("Choose type of equation (1,2,3): ");
		int d = Integer.parseInt(c);
		
		switch(d) {
		case 1:
			System.out.println("Input a = ");
			double a = keyboard.nextDouble();
			System.out.println("Input b = ");
			double b = keyboard.nextDouble();
			if((a==0) && (b==0)) System.out.println("Infinity solution");
			else if((a == 0) && (b!= 0)) System.out.println("No solution");
			else {
				double x = -b/a;
				System.out.println("1 solution: " + x);
			}
			break;
		case 2:
			
			break;
		case 3: 
			break;
		default:
			break;
		}
	}
}
