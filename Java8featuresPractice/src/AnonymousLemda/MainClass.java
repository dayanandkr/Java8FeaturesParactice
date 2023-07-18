package AnonymousLemda;

public class MainClass {

	public static void main(String[] args) {
		
		Anonymous anonymous = new Anonymous() {

			@Override
			public void fun() {
				System.out.println("Hello Anonymous !!");	
			}
			
			public void num(int n) {
				System.out.println(n);
			}	
		};
		
//		LamdaEx lamda = () ->{
//			System.out.println("Hello Lamda !!");
//		};
		
		LamdaEx lamda = () -> System.out.println("Hii lamda");
		
		FunctionalInterfaceEx lamda1 = () ->{
			System.out.println("Hello functional Interface");
		};
		
		anonymous.fun();
		anonymous.num(10);
		
		lamda.show();
		
		lamda1.show();
		FunctionalInterfaceEx.print();
		lamda1.display();
		
	}

}
