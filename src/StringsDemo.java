
public class StringsDemo {

	
	public static void main(String[] args) {
		String s1 = new String("ABC");
		String s2 = "ABC";
		String s3 = "ABC";

		if (s1.equals(s2)) {
			System.out.println("Equal");
		} else {
			System.out.println("Not Equal");
		}
	}
}
