
public class VowelsNConsonents {

	public static void main(String[] args) {
		String s = "I love India";
		String vowels = "AEIOUaeiou";
		int noOfVowels = 0,noOfConsonents = 0, noOfotherChars = 0;
		
		for(int i=0; i<s.length(); i++) {
			Character ch = s.charAt(i);
			if(vowels.contains(ch.toString()))
			{
				noOfVowels++;
			} else if((ch>65 && ch<90) || (ch>97 && ch<122)) {
				noOfConsonents++;
			} else {
				noOfotherChars++;
			}
		}

		System.out.println("No Of Vowels: "+noOfVowels);
		System.out.println("No Of Consonents: "+noOfConsonents);
		System.out.println("No Of Other Chars: "+noOfotherChars);
	}
}
