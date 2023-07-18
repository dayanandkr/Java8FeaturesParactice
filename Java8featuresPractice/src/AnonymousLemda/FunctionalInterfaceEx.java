package AnonymousLemda;


@FunctionalInterface
public interface FunctionalInterfaceEx {
	
	public void show();
	
	//public void numPrint(int n); //Functional interface cann't contains more than methods declaration
	
	static void print() {
		System.out.println("Hello, I am static methods");
	}
	
	default void display() {
		System.out.println("Hello, I am default methods");
	}

}
