
public class ReveseOfNo {
	public int getReverse(int n) {
		int sum = 0;
		while(n > 0) {
			int rem = n%10;
			n = n/10;
			sum = sum * 10+rem;
		}
		return sum;
	}

	public static void main(String[] args) {
		ReveseOfNo o = new ReveseOfNo();
		int reverse = o.getReverse(11);
		System.out.println(reverse);
	}
}
