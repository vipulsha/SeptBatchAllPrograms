
public class ArraysDemo {
	
	public static void main(String[] args) {
		
/*		// Array of int
		int a = 10;
		
		// Array Declaration
		int[] arr = new int[5];
		
		// Array Initialization
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
*/		
			
		// Array of Objects
		Employee[] arr = new Employee[5]; // Array declaration
		
		Employee e = new Employee(1, "ABC");
		arr[0] = e;
		
		arr[1] = new Employee(2, "PQR");
		
		arr[1].print();
		
		
	}

}
