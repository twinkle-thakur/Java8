package LambdaExpresion;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaExpresionPractice {
	public static void main(String[] args) {
//1.Predicate =Boolean valued function
		//(abstract method in Predicate)		
		// boolean test(T t); its lambda expresion is:-
		Predicate<Integer> p=(a)->a>18;
		System.out.println(p.test(10));
		
//2.Consumer =it will only consume not return anything
        //(abstract method in comsumer)  
		//void accept(T t); its lambda ex..
		Consumer<String> c=(t)->System.out.println(t); 
		c.accept("khushi");
		
//3.Supplier =it will not consume(no parameter) anything but it will return result	
		 //(abstract method in Suplier)
		// T get(); its lambda ex..
		Supplier<Integer> s=()->20;
		System.out.println(s.get());
		
//4.funtion=takes an agrument performs logic and returns the result 
		//(abstract method in funtion)
		//R apply(T t);
		Function<Integer, Integer> f =t->t+t;
		System.out.println(f.apply(40));
		
	}

}
