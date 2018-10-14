
public class ArrayDemo {
	
	public static void main(String[] args) {
		
		// Array of int
		int[] arr = new int[5]; // Array Declaration
		 
		int arr2[] = new int[5]; // Array Declaration
		 
		int arr3[] = new int[] {1,2,3}; // Array Declaration+Initialization

		// How to initialize elements in array?
		arr[0] = 10;
//		System.out.println(arr[5]); // Will throw ArrayIndexOutOfBounds Exception
		
		for(int i=0; i<arr2.length; i++) {
			arr2[i] = i+10;
		}
		
		for(int i=0; i<arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		
		for(int no : arr2) {
			System.out.println(no);
		}
		
		Integer[] arr4 = new Integer[4];
	}

}
