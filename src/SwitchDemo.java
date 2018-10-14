import java.util.Scanner;

public class SwitchDemo {
	public static void printSum(int a, int b) {
		System.out.println(a + b);
	}

	public static void printSub(int a, int b) {
		System.out.println(a - b);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("No1:");
		int n1 = scanner.nextInt();
		System.out.println("No2:");
		int n2 = scanner.nextInt();
		System.out.println("1. Add \n2. Sub");
		System.out.println("Enter choice:");
		int ch = scanner.nextInt();
		scanner.close();

		/*
		 * if (ch == 1) { printSum(n1, n2); } else if(ch == 2) { printSub(n1, n2); }
		 * else { System.out.println("Invalid choice"); }
		 */

		switch (ch) {
		default:
			System.out.println("Invalid choice");
			break;
		case 1:
			printSum(n1, n2);
			break;
		case 2:
			printSub(n1, n2);
		}
	}
}
