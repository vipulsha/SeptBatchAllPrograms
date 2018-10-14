
class Employee {
	int id;
	String name;
	
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public void print() {
		System.out.println(id+"  "+name);
	}
}

public class ArrayOfObject {
	public static void main(String[] args) {
		// Array Declaration
		Employee[] arr = new Employee[5];
		// Array initialization
		arr[0] = new Employee(1, "ABC");
		arr[1] = new Employee(2, "PQR");
		
		for (Employee e : arr) {
			e.print();
		}
	}
}
