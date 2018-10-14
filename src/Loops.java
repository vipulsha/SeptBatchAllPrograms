
public class Loops {

	public static int getPower(int base, int power) {
		int finalAns = 1;
		int cnt = 1;
		while(cnt <= power) {
			finalAns = finalAns * base;
			cnt++;
		}
		return finalAns;
	}
	
	
	public static void main(String[] args) {
		int v = getPower(0, 0);
		System.out.println(v);
		
		int n = 5,cnt=1,fact=1;
		while(cnt<=5) {
			fact = fact * cnt;
			cnt++;
		}
		System.out.println(fact);
		
/*		do {
			fact  = fact * cnt;
			cnt++;
		} while(cnt<=5);
		System.out.println(fact);
*/		
		
		
		
		
		
		
		
		
	}
	
}
