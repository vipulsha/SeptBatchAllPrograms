
public class Strings {
	
	public static void main(String[] args) {
		String s = "  This is a table  ";
		
		// Print all the words in a sentence
		String[] arr = s.trim().split(" ");
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
