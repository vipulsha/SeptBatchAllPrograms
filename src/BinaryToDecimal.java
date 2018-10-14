
public class BinaryToDecimal {
	
	public static int getPower(int base, int power) {
		int temp = 1;
		for(int i=1; i<=power; i++) {
			temp = temp * base;
		}
		return temp;
	}

	public static int convertToDecimal(int binaryNo) {
		int sum = 0;
		int p = 0;
		
		while(binaryNo > 0) {
			int rem = binaryNo%10;
			binaryNo = binaryNo/10;
			sum = sum+(rem * getPower(2, p));
			p++;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		int n = convertToDecimal(1010);
		System.out.println(n);
	}
}
