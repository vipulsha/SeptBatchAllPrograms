public class NoOfOccerrenceOfEachWord {
	public static void main(String[] args) {
		String s = "This is a table This table is wooden";
		String[] arr = s.split(" ");
		int cnt=0;
		String tested = "";
		
		for(int i=0; i<arr.length; i++) {
			cnt = 1;
			String word1 = arr[i];
			if (tested.contains(" "+word1+" ")) 
				continue;
			for(int j=i+1; j<arr.length; j++) {
				String word2 = arr[j];
				if (word1.equals(word2)) {
					cnt++;
				}
			}
			tested = tested+" "+word1+" ";
			System.out.println(word1+" --> "+cnt);
		}
	}
}