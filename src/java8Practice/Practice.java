package java8Practice;

import java.time.LocalDate;
import java.time.Month;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Practice {
	public static void main(String[] args) {
		List<Employee> list =DataBase.getEmployees();
			 
		//Q1.print name and birthdate of employee whose birth is on 1998, Month.JULY, 15
		System.out.println("name and birthdate of employee whose birth mont is july");
	    list.stream().filter(e->e.getBornDate().equals(LocalDate.of(1998, Month.JULY, 15))).collect(Collectors.toMap(Employee::getName,Employee::getBornDate)).forEach((n,b)->System.out.println(n+" "+b));
		
		//Q2.give name and id of employees who are married
		System.out.println("name and id of emp who are married");
		list.stream().filter(e->"married".equalsIgnoreCase(e.getMaritalStatus())).collect(Collectors.toMap(Employee::getName,Employee::getEid)).forEach((e,i)->System.out.println(e+" "+i));
		
		//Q3.list out name of female employes born before 2000
		System.out.println("name of female employe born before 2000");
		list.stream().filter(e->"Female".equalsIgnoreCase(e.getSex()) && e.getBornDate().getYear()<2000).collect(Collectors.toList()).forEach(e->System.out.println(e.getName()+" "+e.getBornDate()));
	
	    //Q4.Associate name of male employee with their job title
		System.out.println("male employes and their job title");
		list.stream().filter(e->"male".equalsIgnoreCase(e.getSex())).collect(Collectors.toMap(Employee::getName,Employee::getJobTitle,(n,b)->n+","+b)).forEach((n,t)->System.out.println(n+" "+t));
	
		 Map<String,String>map2=list.stream().collect(Collectors.toMap(Employee::getName,Employee::getDepartment,(n,b)->n+","+b));
		map2.forEach((n,d)->System.out.println(n+" "+d));
		 
		//Q5.give count of total no of employess
		 long count = list.stream().count();
		 System.out.println("total no of employee = "+count);
		 
		//kartik
		 
		//Q1.Retrieve Employee name and birth
//			Map<String, LocalDate> collect = list.stream().collect(Collectors.toMap(Employee::getName,Employee::getBornDate));	
//		  collect.forEach((n,d)->System.out.println(n+" "+d));
		 
		//Q2.Filter the employee name and birth only it department 
		 System.out.println(" employee name and birth only it department ");
		 list.stream().filter(e->"it".equalsIgnoreCase(e.getDepartment())).collect(Collectors.toMap(Employee::getName,Employee::getBornDate)).forEach((e,i)->System.out.println(e+" "+i));
		
		//Q3.Cheak the duplicate name
		 Set<String> distinctEmp = list.stream().map(e->e.getName()).collect(Collectors.toSet());
		 Set<String> duplicateNames = list.stream().map(e->e.getName()).filter(name -> !distinctEmp.add(name)).collect(Collectors.toSet());
         duplicateNames.forEach(l->System.out.println(l+" "));
         
        //Q4.Count employees by marital status
 	    Map<String, Long> maritalStatusCount = list.stream() .collect(Collectors.groupingBy(Employee::getMaritalStatus, Collectors.counting()));
 	    System.out.println("Employee Count by Marital Status:");
 	    maritalStatusCount.forEach((status, countt) -> System.out.println(status + ": " + countt));
 
 	    //Q5. Find employees who joined before 2010
	    System.out.println("\nEmployees who joined before 2010:");
	  list.stream().filter(emp -> emp.getHireDate().getYear() < 2010).map(Employee::getName).forEach(System.out::println);

//	    public static <T, K, U>
//	    Collector<T, ?, Map<K,U>> toMap(Function<? super T, ? extends K> keyMapper,
//	                                    Function<? super T, ? extends U> valueMapper,
//	                                    BinaryOperator<U> mergeFunction)
//	   R apply(T t);
	//  R apply(T t, U u);
	  
	  Function<Employee , String> keyMapper= (e)->e.getName();
	  
	  Function<Employee, String> valueMapper=e->e.getJobTitle();
	//  public interface BinaryOperator<T> extends BiFunction<T,T,T>
	  //R apply(T t, U u);
	  BinaryOperator<String> mergeFunction=(t,u)->t+","+u;
	  System.out.println("******");
	  list.stream().filter(e->"male".equalsIgnoreCase(e.getSex())).collect(
			  Collectors.toMap(keyMapper,valueMapper,mergeFunction))
	  .forEach((n,t)->{
		  if(t.contains(",")) {
			  String[] title = t.split(",");
			  System.out.println(n+" "+title[0]);
			  System.out.println(n+" "+title[1]);
		  }
		  else {
			  System.out.println(n+" "+t);
		  }
		  });
		
	  //prince
	  //1).Which employees are working in the IT department as Java Developers, and in which cities are they located?
	 System.out.println("java dev of it dep with their cities");
	  list.stream().filter(e->"it".equalsIgnoreCase(e.getDepartment()) && "Java Developer".equalsIgnoreCase(e.getJobTitle())).collect(Collectors.toList()).forEach(e->System.out.println(e.getName()+" "+e.getDepartment()+" "+e.getJobTitle()+" "+e.getWorkLocation()));
	  
	  //2)..Who is the highest-paid employee, and what is their designation?
	  System.out.println(" hhjgfjhf");
	 // list.stream().max((e1,e2)->e1.getCtc()-e2.getCtc())
	  Comparator<Employee> c=(s1,s2)->{
		  long result=s1.getCtc()-s2.getCtc();return (int) result;
	  };
	  Employee employee = list.stream().max(c).get();
	  System.out.println(employee.getName()+" "+employee.getCtc()+" "+employee.getJobTitle());
 
	}

}
