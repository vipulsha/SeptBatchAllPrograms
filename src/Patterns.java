
public class Patterns {
	
	public static void printPatter1(int n) {
		for(int row=1; row<=n; row++) {
			for(int star=1; star<=row; star++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	
	public static void printPattern2(int n) {
		// For handling rows
		for(int row=1; row<=n; row++) {
			// For spaces
			for(int space=1; space<=n-row; space++) {
				System.out.print(" ");
			}
			// For stars
			for(int star=1; star<=(2*row)-1; star++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
//		printPatter1(5);
		printPattern2(10);
		
	}

}
