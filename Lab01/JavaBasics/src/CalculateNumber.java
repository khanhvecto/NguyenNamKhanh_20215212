//Ex2.2.5

import javax.swing.JOptionPane;
public class CalculateNumber {
	public static void main(String[] args) {
		String d1, d2, strNotification;
		d1 = JOptionPane.showInputDialog("d1 = ");
		double num1 = Double.parseDouble(d1);
		d2 = JOptionPane.showInputDialog("d2 = ");
		double num2 = Double.parseDouble(d2);
		
		double sum, different, product, quotient;
		sum= num1+num2;
		if(num1>num2) different = num1-num2;
		else different = num2 - num1;
		product = num1*num2;
		
		System.out.println("Sum: " + sum);
		System.out.println("Different: " + different);
		System.out.println("Product: " + product);
		if(num2 == 0) System.out.println("Error quotient n1/n2");
		else {
			quotient = num1/num2;
			System.out.println("Quotient n1/n2 = " + quotient);
		}
		System.exit(0);
	}
}
