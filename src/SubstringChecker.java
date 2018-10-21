
public class SubstringChecker {
	public static void main(String[] args) {
		String s1 = "ABCDEF";
		String s2 = "DEF";
		if (s2.length() > s1.length()) {
			System.out.println("Not substring");
		} else {
			int indexOf = s1.indexOf(s2);
			if (indexOf == -1 ) {
				System.out.println("Not substring");
			} else {
				System.out.println("Substring");
			}
		}
	}
}