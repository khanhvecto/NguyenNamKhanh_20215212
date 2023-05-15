package hust.soict.globalict.lab01;
//Ex2.2.6

import java.lang.Math;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Solve {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Choose type of equation:\n1. Linear equation with 1 variable\n2. Linear system with 2 variables\n3. Second-degree equation with 1 variable\n=> Your choice: ");
		int d = keyboard.nextInt();
		
		switch(d) {
		case 1:
			System.out.println("ax + b = 0");
			System.out.print("Input a = ");
			double a = keyboard.nextDouble();
			System.out.print("Input b = ");
			double b = keyboard.nextDouble();
			if((a==0) && (b==0)) System.out.println("Infinity solution");
			else if((a == 0) && (b!= 0)) System.out.println("No solution");
			else {
				double x = -b/a;
				System.out.println("1 solution: " + x);
			}
			break;
			
		case 2:
			System.out.println("ax1 + bx2 = c\ndx1 + ex2 = f");
			
			//Input
			System.out.print("Input a = ");
			double a11 = keyboard.nextDouble();
			System.out.print("Input b = ");
			double a12 = keyboard.nextDouble();
			System.out.print("Input c = ");
			double b1 = keyboard.nextDouble();
			System.out.print("Input d = ");
			double a21 = keyboard.nextDouble();
			System.out.print("Input e = ");
			double a22 = keyboard.nextDouble();
			System.out.print("Input f = ");
			double b2 = keyboard.nextDouble();
			
			// Compute determinant
			double det,det_x,det_y;
			det = a11*a22 - a12*a21;
			det_x = b1*a22 - b2*a12;
			det_y = a11*b2 - b1*a21;
			
			// Check
			double x1, x2;
			if(det != 0) {
				x1 = det_x/det;
				x2 = det_y/det;
				System.out.println("x1 = " + x1);
				System.out.println("x2 = " + x2);
			} else if(det_x == 0 && det_y == 0)
				System.out.println("Infinitely solution");
			else System.out.println("No solution");
			break;
			
		case 3:
			System.out.println("ax^2 + bx + c = 0 (a != 0)");
			
			// Input
			System.out.print("Input a = ");
			double a3 = keyboard.nextDouble();
			System.out.print("Input b = ");
			double b3 = keyboard.nextDouble();
			System.out.print("Input c = ");
			double c3 = keyboard.nextDouble();

			double delta = b3*b3 - 4*a3*c3;
			
			if(delta < 0) System.out.println("No root");
			else if (delta == 0) System.out.println("x1 = x2 = " + (-b3/(2*a3)));
			else {
				double x3 = (-b3-Math.sqrt(delta)) / (2*a3);
				double x4 = (-b3+Math.sqrt(delta)) / (2*a3);
				System.out.println("x1 = " + x3 + ", x2 = " + x4);
			}
			break;
		default:
			System.out.println("Wrong choice.");
			break;
		}
		System.exit(0);
	}
}
