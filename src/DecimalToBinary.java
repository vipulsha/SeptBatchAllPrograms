
public class DecimalToBinary {
	public static String convertToBinary(int n) {
		String binary = "";
		while(n > 0) {
			int rem = n%2;
			binary = rem+binary;
			n = n/2;
		}
		return binary;
	}
	
	public static void main(String[] args) {
		String s = DecimalToBinary.convertToBinary(10);
		System.out.println(s);
	}
}
