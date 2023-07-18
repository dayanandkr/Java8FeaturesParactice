package CollectionWithLamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionWithLamdaEx {

	public static void main(String[] args) {
		
		List<Employee> lst = new ArrayList<Employee>();
		
		lst.addAll(
				Arrays.asList(
						new Employee("Daya", 1),
						new Employee("Bajrangi", 2),
						new Employee("Ram", 3),
						new Employee("Raju", 4),
						new Employee("mohan", 5),
						new Employee("madan", 6),
						new Employee("sonu", 7)
					));
		System.out.println(lst);
		
		//case -1
		
		/*
		Comparator<Employee> comp = new Comparator<Employee>() {

			@Override
			public int compare(Employee e1, Employee e2) {
				return e1.getName().compareTo(e2.getName());
			}
		};
		
		Collections.sort(lst,comp);
		*/
		
		// case -2
	/*	
		Collections.sort(lst,
				(Employee e1, Employee e2) -> e1.getName().compareTo(e2.getName()) );
		
		*/
		
		//case -3
		
		Collections.sort(lst, Comparator.comparing(Employee :: getName));
		System.out.println(lst);
	
	}

}
