package LamdaAsArgument;

interface Operation{
	public int opt(int x, int y);
}

public class LamdaAsArgumentEx {
	 public static void result(int a, int b, Operation obj) {
		 System.out.println(obj.opt(a,b));
	 }
	
	public static void main(String arg[]) {
		//result(50,8, (a,b) -> (a*b));
		
		Operation obj =(a,b) -> (a*b);
		
		System.out.println(obj.opt(50, 8));
	}
	

}
