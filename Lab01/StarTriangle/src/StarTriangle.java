// Ex 6.3

import javax.swing.JOptionPane;
public class StarTriangle {
	public static void main(String[] args) {
		String strn;
		strn = JOptionPane.showInputDialog("Input n: ");
		int n = Integer.parseInt(strn);
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) System.out.print("* ");
			System.out.print("\n");
		}
		System.exit(0);
	}
}
