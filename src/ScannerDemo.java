import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		// How to scan user inputs from console
		Scanner s = new Scanner(System.in);
		System.out.println("Enter No1:");
		int no1 = s.nextInt(); 
		System.out.println("Enter No2:");
		int no2 = s.nextInt();
		System.out.println(no1+no2);
	}
}
