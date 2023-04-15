import java.util.Arrays;
import java.util.Scanner;
public class Sort {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		//float[] arr = new float[100];
		float a;
		int n;
		
		// Input
		System.out.println("Number of element: "); n = keyboard.nextInt();
		float[] arr = new float[n];
		for(int i=0; i<n; i++) {
			System.out.print("a[" +(i+1)+ "] = "); 
			arr[i] = keyboard.nextFloat();
		}
		
		// Sort
		for(int i=0; i<n-1; i++)
			for(int j=i+1; j<n; j++) {
				if(arr[i] > arr[j]) {
					a = arr[i];
					arr[i] = arr[j];
					arr[j] = a;
				}
			}
		
		System.out.println(Arrays.toString(arr));
	}
}
