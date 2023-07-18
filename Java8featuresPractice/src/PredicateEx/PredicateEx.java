package PredicateEx;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

//public interface MyPredicate<T>{
//	boolean operation(T t);
//}

public class PredicateEx {
	

	public static void main(String[] args) {
		
		List<Car> carList = Arrays.asList(
			new Car("Toyota", "White", 700000),
			new Car("BMW", "Black", 305000),
			new Car("Hondai", "White", 30000),
			new Car("Marcedes", "white", 300000),
			new Car("TATA", "red", 450000),
			new Car("Thar", "Black", 100000)
				);
		
		System.out.println(carList);
		
		Predicate<Car> p = x -> x.getPrice() >450000;
		
		for(Car car : carList) {
			if(p.test(car)) {
			System.out.println(car.getName());
			}
		}
				
	}

}
