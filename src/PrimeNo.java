
public class PrimeNo {
	public static boolean isPrime(int n) {
		for(int i=2; i <= n/2; i++) {
			if (n%i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		boolean b = isPrime(11);
		if (b) {
			System.out.println("PRIME");
		} else {
			System.out.println("NOT PRIME");
		}
	}
}
