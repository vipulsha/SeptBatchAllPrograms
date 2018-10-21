
public class StringImmutable {

	public static void main(String[] args) {
		String s = "ABC";
		s = s.replace("BC", "QR");
		System.out.println(s);
	}
}
