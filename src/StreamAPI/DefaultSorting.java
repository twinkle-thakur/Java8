package StreamAPI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class DefaultSorting {
public static void main(String[] args) {
	List<Integer> list=new ArrayList<>();
	list.add(40);
	list.add(5);
	list.add(50);
	list.add(30);
	list.add(20);
//	Collections.sort(list);
//	System.out.print(list);
//if we want to reverse list then we cant use polymorphism concept
//becoz all wrapper classes are final therefore we cant implement it
//therefore we cant use comparable we have to use comparator without implementing	
	
	//1.with anonymous class
	Comparator<Integer> sortByAnonymous=new Comparator<Integer>() {
		
		@Override
		public int compare(Integer o1, Integer o2) {
			
			return o2-o1;
		}
	};
	Collections.sort(list, sortByAnonymous);
//	System.out.print(list);
	
	//2.by lambda expresion
	// int compare(T o1, T o2);
//	Comparator<Integer> sortByLambdaExpression=(o1,o2)->o2-o1;
//	Collections.sort(list, sortByLambdaExpression);
	//or we can directly write like this
	Collections.sort(list, (o1,o2)->o2-o1);
//	System.out.print("\n"+list);
	
           //using streamAPI
	System.out.println("using streamAPI");
	//step 1. Convert list into stream
	Stream<Integer> stream = list.stream();
	Stream<Integer> sorted = stream.sorted(); 
	sorted.forEach(System.out::println);
	//above 3 line code we can also write in one line
	list.stream().sorted().forEach(System.out::println);
	//if we want more flexibility (spaces within one line then)
	list.stream().sorted().forEach(l->System.out.print(l+" "));
	
}
}
