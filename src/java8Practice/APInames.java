package java8Practice;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class APInames {
public static void main(String[] args) throws ClassNotFoundException {
	Class<?> className = Class.forName("java.lang.Object");
	Method[] methods = className.getDeclaredMethods();
	
	List<String> collect = Arrays.stream(methods).map(Method::getName).distinct().collect(Collectors.toList());
	
	collect.forEach(System.out::println);
	System.out.println("Total API count "+collect.size());
}
}
