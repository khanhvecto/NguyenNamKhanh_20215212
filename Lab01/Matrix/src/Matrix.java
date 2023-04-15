import java.util.Scanner;
public class Matrix {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		// Input type of matrix
		int a, b;
		System.out.println("Input size of matrix (AxB).");
		System.out.print("A = ");
		a = keyboard.nextInt();
		System.out.print("B = ");
		b = keyboard.nextInt();
		
		// Input matrices
		int[][] A = new int[a][b];
		int[][] B = new int[a][b];
		System.out.println("Input matrix A:");
		for(int i=0; i<a; i++)
			for(int j=0; j<b; j++) A[i][j] = keyboard.nextInt();
		System.out.println("Input matrix B:");
		for(int i=0; i<a; i++)
			for(int j=0; j<b; j++) B[i][j] = keyboard.nextInt();
		
		// Add 2 matrices
		System.out.println("Result of adding A and B:");
		for(int i=0; i<a; i++) {
			for(int j=0; j<b; j++) {
				A[i][j] += B[i][j];
				System.out.print(A[i][j] + " ");
			}
			System.out.print("\n");
		}
	}
}
