package StreamAPIEx;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamAPIEx {
	public static void main(String arg[]) {
		
		// case - 1
		//IntStream.range(1, 11).forEach(x -> System.out.println(x));
		
		// case - 2 
		//IntStream.range(1, 6).forEach(System.out :: println);
		
		//Case -3
		//IntStream num = IntStream.iterate(2, x -> x+1);
		//num.limit(7).forEach(System.out :: println);
		
		/*
		Stream.of("Java", "Python", "Data Structure","Dart", "Go", "Java Script")
		.filter(x -> x.contains("J"))
		.map(String :: toUpperCase)
		.forEach(System.out :: println);	
	
	*/
		
		//Stream.generate(Math ::random).limit(5).forEach(System.out :: println);
		
		/*
		System.out.println(Arrays.asList("Java", "JavaScript", "Python", "Java").stream()
				.filter(x -> x.contains("J")).collect(Collectors.toList())
				);
*/
		
		/*
		List<Student> lst = new ArrayList<>();
		lst.add(new Student("Raju",subject.ENGLISH, 56));
		lst.add(new Student("Ramu", subject.MATH, 78));
		lst.add(new Student("Rakesh", subject.SCIENCE, 71));
		
		System.out.println(
				lst.stream()
				.collect(Collectors.toMap(Student :: getName, Student :: getMarks))
				);
				
				*/
		
		/*
		List<Student> lst = new ArrayList<>();
		lst.add(new Student("Raju",subject.ENGLISH, 56));
		lst.add(new Student("Ramu", subject.MATH, 78));
		lst.add(new Student("Rakesh", subject.SCIENCE, 71));
		lst.add(new Student("Raju",subject.SCIENCE, 56));
		lst.add(new Student("Raju", subject.MATH, 78));
		lst.add(new Student("Rakesh", subject.MATH, 71));
		
		Map<String, List<subject>> map = new HashMap<>();
		
		lst.stream().forEach(stu -> {
			map.computeIfAbsent(stu.getName(), x -> new ArrayList<subject>())
			.add(stu.getSub());
		});
		
		System.out.println(map);
		
		*/
		/*
		List<String> lst1 = Arrays.asList("A","B");
		List<String> lst2 = Arrays.asList("C", "D", "E");
		List<String> lst3 = Arrays.asList("F");
		
		System.out.println(
				Stream.of(lst1,lst2,lst3).flatMap(List :: stream)
				.collect(Collectors.toList())
				);
		*/
		
		/*
		Map<String, List<Integer>> map = new LinkedHashMap<>();
		map.put("one", Arrays.asList(1,2,3,4));
		map.put("two", Arrays.asList(5,6,7));
		
		
		System.out.println(
				map.values().stream().flatMap(List :: stream)
				.collect(Collectors.toList())
				);
		*/
		
		List<Map<String, Integer>> lst = new ArrayList<Map<String, Integer>>();
		
		Map<String, Integer> map1 = new HashMap<>();
		map1.put("one", 11);
		map1.put("two", 22);
		
		Map<String, Integer> map2 = new HashMap<>();
		map2.put("three", 33);
		map2.put("four", 44);
		
		lst.add(map1);
		lst.add(map2);
		
		System.out.println(
		lst.stream().map(Map :: values).flatMap(Collection :: stream).collect(Collectors.toList())
		);
	}
	
}
