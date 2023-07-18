package StreamAPIEx;

public class Student {
	
	private String name;
	
	public subject sub;
	
	public enum subject {
		  MATH,
		  SCIENCE,
		  ENGLISH
		}
	//private String sub;
	
	private int marks;

	public String getName() {
		return name;
	}

	public subject getSub() {
		return sub;
	}

	public int getMarks() {
		return marks;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSub(subject sub) {
		this.sub = sub;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name, subject sub, int marks) {
		super();
		this.name = name;
		this.sub = sub;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", sub=" + sub + ", marks=" + marks + "]";
	}
	
	

	
	
	}
