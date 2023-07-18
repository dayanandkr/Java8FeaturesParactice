package FunctionalComponentEx;

import java.util.function.BinaryOperator;

public class Main {
	
	//Predicate    --> boolean test(T ob)
	//BiPredicate  --> boolean test(T a1, T a2)
	//Consumer	   --> void accept(T ob)
	//BiConsumer   --> void accept(T a1, T a2)
	//Function	   --> E apply(T ob)
	//BiFunction   --> E apply(T a1, T a2)
	//Supplier	   --> E get()
	//UnaryOperator--> E apply(T t)
	//BinaryOperator--> E apply(T t1, T t2)

	public static void main(String[] args) {
		
		BinaryOperator<String> u = (x,y) -> x+y;
		System.out.println(u.apply("Raja","Ram"));
		
		/*
		UnaryOperator<Integer> u = x -> x+2;
		System.out.println(u.apply(6));
		*/
		
		/*
		Supplier<String> s = () -> "Not Found";
		System.out.println(s.get());
		*/
		
		/*
		BiFunction<Integer, Integer, String> f = (x,y) -> x+" "+y;
		System.out.print(f.apply(300, 50));
		*/
		
		/*
		Function<Integer, Boolean> f = x -> x>50;
		System.out.println(f.apply(450));
		*/
		
		/*
		Map<Integer, String> map = new HashMap<>();
		map.put(100, "Raju");
		map.put(200, "Ramu");
		map.put(300, "Rakesh");
		
		map.forEach((x,y) -> System.out.println(x+ ": "+ y));
		*/
		
		/*
		BiConsumer<String, String> cns = (x,y) -> System.out.println(x+":"+y);
		cns.accept("Dayanand", "Kumar");
		*/
		
		/*
		Consumer<String> con = x -> System.out.println(x.length());
		con.accept("Dayanand");
		*/
		
		/*
		List<Integer> lst = Arrays.asList(1,2,3,4,5,6);
		Consumer<Integer> c = x -> System.out.println(x);
		lst.stream().forEach(c);
		*/
		
		/*
		Predicate<Integer> p = x -> x>50;
		System.out.print(p.test(5));
		*/
		
		/*
		BiPredicate<Integer,Integer> p = (x,y) -> x>y;
		System.out.print(p.test(15,8));
		*/
		
		

	}

}
