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
	
	public static void main(String[] args) {
		Employee e1 = new Employee(1, "ABC");
		Employee e2 = new Employee(1, "ABC");
		
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		
		if (e1 == e2) {
			System.out.println("Eq");
		} else {
			System.out.println("Not Eq");
		}
		
	}
}
