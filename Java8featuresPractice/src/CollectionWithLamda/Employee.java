package CollectionWithLamda;

public class Employee {
	
	private String name;
	
	private int emp1;

	public Employee(String name, int emp1) {
		super();
		this.name = name;
		this.emp1 = emp1;
	}

	public String getName() {
		return name;
	}

	public int getEmp1() {
		return emp1;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", emp1=" + emp1 + "]";
	}
	
	
	
	

}
